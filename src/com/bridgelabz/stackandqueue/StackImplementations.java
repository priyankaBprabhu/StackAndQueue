package com.bridgelabz.stackandqueue;


public class StackImplementations<T> implements IList<T>  {
    LinkedListImplementations<T>  list = new LinkedListImplementations();

    public void push(T num) {
        list.add(num);
    }

    @Override
    public void pop() {
       while(list.size() > 0) {
            peak();
            list.pop();
        }
    }
    void peak(){
        System.out.println(list.head.data);
    }

    @Override
    public String toString() {
        return "StackImplementations{" + list + '}';
    }
}
