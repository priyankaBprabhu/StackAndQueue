package com.bridgelabz.queue;

public class QueueImplementations<T> implements IQueue<T> {
    LinkedListImplementationsQueue<T> list = new LinkedListImplementationsQueue();


    @Override
    public void enqueue(T num) {
         list.append(num);
    }
    @Override
    public void dequeue() {
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
        return "QueueImplementations{" + list +
                '}';
    }
}
