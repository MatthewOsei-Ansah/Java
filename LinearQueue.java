package com.company;
import java.util.Arrays;

public class Queue {
    private int front, rear, capacity;
    private int queue[];

    public Queue(int size){
        front = 0;
        rear = -1;
        capacity = size;
        queue =  new int[capacity];
    }

    public boolean isEmpty(){
        return (rear == -1);
    }

    public boolean isFull(){
        return !isEmpty() && ((rear + 1) % capacity) == front;
    }

    public void Enqueue(int num){
        if(!isFull()){
            if(isEmpty()){
                rear = front;
            }else {
                rear = (rear + 1) % capacity;
            }
            queue[rear] = num;
        }else{
            System.out.println("The queue is full");
        }

    }

    public void Dequeue(){
        if(!isEmpty()){
            if(front == capacity){
                front = front % capacity;
            }
            queue[front] = -999999;
            if (front == rear){
                rear = -1;
            }
            front ++;
        }
    }

    public String getQueue(){
        return Arrays.toString(queue);
    }

    @Override
    public String toString(){
        String output = "";
        for(int i : queue) {
            if (i != -999999) {
                output = output + i + ",";
            }
        }
        return output;
    }
}
