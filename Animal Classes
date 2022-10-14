package com.company;

public class Main {

    public static void main(String[] args) {
	Fish thisFish = new Fish("Little Fish");
	thisFish.setMaxSize(3);
	Duck thisDuck = new Duck("Little Duck", 1);

	for(int i = 0; i < 3; i++){
	    thisDuck.feed();
        System.out.println(thisDuck.state);
        thisFish.feed();
        System.out.println(thisFish.state);
    }
    }
}


//Split 

package com.company;

public class Animal {
    protected String state;
    protected int size;

    public Animal(String State, int Size){
        this.state = State;
        this.size = Size;
    }

    public void feed(){
        size += 1;
        System.out.println("The animal has been fed");
    }

    public String getState(){
        return state;
    }

    public int getSize(){
        return size;
    }
}


//Split

package com.company;

public class Fish extends Animal {
    private int maxSize;

    public Fish(String State){
        super(State, 1);
        maxSize = 2;
    }
    public void setMaxSize(int maxsize){
        maxSize = maxsize;
    }

    @Override
    public void feed(){
        size += 2;
        System.out.println("Fish has been fed");
        if(size >= maxSize){
            state = "BIG FISH!";
        }
    }
}


//Split

package com.company;

public class Duck extends Animal {
    public Duck(String State, int Size) {
        super(State, Size);
    }

    @Override
    public void feed(){
        size += 1;
        if(size >= 5){
            state = "BIG DUCK";
        }
    }
}
