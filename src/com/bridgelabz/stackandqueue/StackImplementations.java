package com.bridgelabz.stackandqueue;


public class StackImplementations<T> implements IList<T>  {
    LinkedListImplementations<T>  list = new LinkedListImplementations();

    public void push(T num) {
        list.add(num);
    }

    @Override
    public String toString() {
        return "StackImplementations{" + list + '}';
    }
}
