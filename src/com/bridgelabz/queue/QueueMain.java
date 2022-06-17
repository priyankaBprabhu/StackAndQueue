package com.bridgelabz.queue;

import com.bridgelabz.stack.IList;

public class QueueMain {
    public static void main(String[] args) {
        IQueue<Integer>  queue = new QueueImplementations();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println(queue);
    }
}
