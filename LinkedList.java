package LinkedList;

import java.util.ArrayList;

/**
 *
 * @author water
 */
public class LinkedList {   //The front of the priority queue, e.g the 1st element
    private Element front;
    private int length = 0;

    public static void main(String[] args) {
    }

    public String[] asArray() {//Converts the priority queue into a an Array List
        ArrayList<String> a = new ArrayList<String>();
        Element e = front;

        while (e != null) {//Iterate through elements adding to the array
            a.add(e.Value());
            e = e.Next();
        }

        return a.toArray(new String[a.size()]);
    }

    public boolean isEmpty() {//Return if the queue is empty
        return (length == 0);
    }

    public void append(String value) {//Append to the end of the list
        Element current;
        Element tail;

        if (front != null) {
            current = front;// Start at the front of the LinkedList

            while (current.Next() != null) {//Iterate through elements in the LinkedList
                current = current.Next();
            }

            tail = new Element(value, current, null);// Create new tail Element pointing back to the previous Tail
            current.Next(tail);//Update the end of the LinkedList to point to this new Element
            length++;
        } else {//Add the front of the linked list
            front = new Element(value, null, null);
            length++;
        }
    }

    public String remove(String value) {//Remove the first element that has a matching value, and reorganise the queue

        //Throw an error if the value is not present
        Element current;
        Element removed = null;
        current = front;
        boolean found = false;

        if (current != null) {
            while (current.Next() != null) {
                if (current.Value().equals(value)) {
                    removed = current;
                    current.Previous().Next(current.Next());
                    current.Next().Previous(current.Previous());
                    length--;
                    found = true;
                    return removed.Value();
                } else {
                    current = current.Next();
                }
            }if(current.Next() == null && !found){
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
        return removed.Value();
    }

    public String pop() {//Remove the 1st element from the queue and reorganise the queue
        //Throw an error if the queue is empty
        Element popped;
        if (!isEmpty()) {
            popped = front;
            front.Next().Previous(null);
            front = front.Next();
            length--;
            return popped.Value();
        } else if (isEmpty()) {
            throw new UnsupportedOperationException();
        }
        return front.Value();
    }


    public String pop(int index) {//Remove from the queue the element at the specified index  reorganise the queue
        //Throw an error if the index is invalid
        Element current;
        Element popped = null;
        int count = 0;
        if (!isEmpty()) {
            if (0 <= index && index < length) {
                current = front;
                while (count < index) {
                    current = current.Next();
                    count++;
                }
                popped = current;
                current.Previous().Next(current.Next());
                current.Next().Previous(current.Previous());
                length--;
                return popped.Value();
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        return popped.Value();
    }

    public void insert(String value, int index) {//Insert the item into the correct position in the linked list
        //Throw an error if the index is invalid
        Element current;
        Element Insert;
        Element FrontInsert;
        int count = 0;
        if (!isEmpty()) {
            if (index > 0 && index < length) {
                current = front;
                while (count < index) {
                    current = current.Next();
                    count++;
                }
                Insert = new Element(value, current.Previous(), current);
                current.Previous().Next(Insert);
                current.Previous(Insert);
                length++;
            } else if (index == 0) {
                FrontInsert = new Element(value, null, front);
                front.Previous(FrontInsert);
                front = FrontInsert;
                length++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public int index(String value) {//Return the position of the first occurrence of the value in the linked list
        //Throw an error if the value does not exist
        Element current;
        int index = 0;
        boolean found = false;
        if (!isEmpty()) {
            current = front;
            while (current.Next() != null) {
                if (current.Value().equals(value)) {
                    found = true;
                    return index;
                } else {
                    current = current.Next();
                    index++;
                }
            } if(current.Next() == null && !found){
                throw new IllegalArgumentException("Value is not in list");
            }
        } else {
            throw new IllegalArgumentException("Value is not in list");
        }
        return index;
    }

    public int length() {//Return the number of elements in the Linked List
        return length;
    }

    public boolean search(String value) {//Return true if the value exists in the Linked List
        boolean found = false;
        Element current = front;
        if (!isEmpty()) {
            while (current.Next() != null) {
                if (current.Value().equals(value)) {
                    found = true;
                    break;
                } else {
                    current = current.Next();
                }
            }
        }
        if (!found) {
            return false;
        } else {
            return true;
        }
    }
}
