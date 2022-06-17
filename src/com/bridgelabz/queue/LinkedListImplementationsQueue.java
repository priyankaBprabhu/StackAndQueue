package com.bridgelabz.queue;


public class LinkedListImplementationsQueue<T>  {
    NodeQ head;
    NodeQ temp;
    public void append(T num) {
        NodeQ node = new NodeQ( num);
        if (head == null) {
            head = node;
            return;
        }
        temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void pop() {
         head = head.next;
    }

    public int size() {
        temp = head;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }


    @Override
    public String toString() {
        return "{head= " + head + " }" ;
    }
}
