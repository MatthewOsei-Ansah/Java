// Remember to split up when putting into an IDE

package com.company;

public class Main {

    public static void main(String[] args) {
	Animal thisFish = new Animal("Fish", 1);
    System.out.println(thisFish.getState() + "is of size" + thisFish.getSize());
    }

    while(!thisFish.getState().equals("Big Fish")){
        thisFish.Feed();
    }
    System.out.println("It is now big")
    System.out.println(thisFish.getState)
}


// Split
package com.company;

public class Animal {
    private String state;
    private int size;

    public Animal(){

    }

    public Animal(String state, int size){
        this.state = state;
        this.size = size;
    }

    public String getState(){
        return state;
    }

    public int getSize(){
        return size;
    }

    public void Feed(){
        size += 1;
        System.out.println("The animal has been feed");
        if (size == 5){
            state = "Big Fish";
        }
    }
}
