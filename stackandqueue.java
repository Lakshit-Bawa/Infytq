//STACK
package com;

import java.sql.SQLOutput;

public class stack {
    static final int MAX = 1000;
    static int top = 0;
    static int[] st = new int[MAX];

    static void push(int a){
        if(top > MAX){
            System.out.println("Stack Overflow");
        }
        else{
            st[top++] = a;
        }

    }

    static void pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
        }
        int a = st[--top];
        System.out.println("Element is " + a);
    }

    public static void main(String[] args) {
        stack s = new stack();
        stack s2 = new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s2.push(40);
        s2.push(50);
        for(int i=0; i<top; ++i)
            System.out.println(st[i]);
        s.pop();
        s.pop();
        for(int i=0; i<top; ++i)
            System.out.println(st[i]);
    }
}



//QUEUE
package com.company;

public class CircularQueue {

    static final int MAX = 10;
    int[] arr = new int[MAX];
    int front;
    int rear;

    CircularQueue(){
        this.front = 0;
        this.rear = 0;
    }

    public void insert(int x){

        if((front == 0  && rear == MAX) || (rear == front - 1)){
            System.out.println("Queue is full");
        }
        else{
            arr[rear] = x;
            rear = (rear + 1) % MAX;
        }

    }

    public int remove(){
        if(front == rear + 1){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int x = arr[front];
            front = (front + 1) % MAX;
            return x;
        }

    }

    public void print(){
        int x = front;

        while(x != rear){
            System.out.print(arr[x] + " -> ");
            x++;
        }

    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();

        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.insert(6);
        cq.insert(7);
        cq.insert(8);
        cq.insert(9);
        cq.insert(10);

        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();


        cq.print();
    }

}
