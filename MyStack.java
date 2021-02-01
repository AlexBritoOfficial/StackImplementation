package com.company.ImplementDS.MyStack;

public class MyStack<E>  {
    int INITIAL_CAPACITY = 10;
    E [] data =  (E[]) new Object [INITIAL_CAPACITY];
    int size = 0;

    public MyStack() {
    }

    public MyStack(E [] array) {
        for (int i = 0; i < array.length ; i++) {
            push(array[i]);
        }
    }

    public void push(E element){
        push(size(),element);
    }

    public void push(int index, E element){
        ensureCapacity();
        data[index] = element;
        size++;
    }

    public void pop(){
        data[size] = null;
        size--;
    }

    public E peek(){
        return data[size];
    }

    public void ensureCapacity(){
        if(size >= INITIAL_CAPACITY){
            data = (E[]) new Object[INITIAL_CAPACITY * 2 + 1];
        };
    }

    public int indexOf(E element){
        for (int i = 0; i <= size ; i++) {
            if(element.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();


        myStack.pop(); // size 8
        myStack.pop(); // size
        System.out.println(myStack.peek());
        System.out.println(Runtime.getRuntime().availableProcessors());

    }


}
