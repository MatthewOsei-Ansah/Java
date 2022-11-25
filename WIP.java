package com.company;

import java.util.ArrayList;

public class PriorityQueue {
    private final int MAX_SIZE;
    private final int INITIAL_REAR = -1;
    private int rear = INITIAL_REAR;
    private final int FRONT = 0;
    private ArrayList<Integer> PQueue;

    public PriorityQueue(int max_size){
        MAX_SIZE = max_size;
        PQueue = new ArrayList<>(max_size);
    }

    public void EnQueue(int num){
        int count = 0;
        if(!isFull()){
            if(rear == INITIAL_REAR){
                rear = rear + 1;
                PQueue.add(rear, num);
            }else{
                for(Integer i : PQueue){
                    if(num >= i){
                        count ++;
                    }else{
                        PQueue.add(count, num);
                        break;
                    }
                }
            }
            rear ++;
        }
    }

    public void DeQueue(){
        if(!isEmpty()){
            PQueue.remove(FRONT);
            rear --;
        }
    }

    public boolean isEmpty(){
        return PQueue.isEmpty();
    }

    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }

    public String GetQueue(){
        return PQueue.toString();
    }

}
