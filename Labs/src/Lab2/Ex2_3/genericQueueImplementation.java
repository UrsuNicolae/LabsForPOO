package Lab2.Ex2;

import java.lang.reflect.Array;

public class genericQueueImplementation implements genericQueue{

    private int elements[];
    private int front, rear;
    private int size, maxSize;


    genericQueueImplementation(){
        front = 0;
        rear = -1;
        size = 0;
        maxSize = 1000;
        elements = new int[maxSize];
    }

    genericQueueImplementation(int maxSize) {
        front = 0;
        rear = -1;
        size = 0;
        this.maxSize = maxSize;
        elements = new int[maxSize];
    }

    @Override
    public void push(int e) {
        if(rear == maxSize -1) {
            int j = 0;
            for(int i = front; i <= rear; i++){
                elements[j++] = elements[j];
            }
            front = 0;
            rear = size -1;
        }
        elements[++rear] = e;
        size++;
    }

    @Override
    public void pop() {
        front++;
        size--;
    }

    public boolean isEmpty (){
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public int state() {
        return size;
    }
}
