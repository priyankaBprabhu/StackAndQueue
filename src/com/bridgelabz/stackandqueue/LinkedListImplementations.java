package com.bridgelabz.stackandqueue;


public class LinkedListImplementations<T>  {
    Node head;
    Node temp;
    public void add(T num) {
        Node node = new Node(num);
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

    @Override
    public String toString() {
        return "{"+"head=" + head + " }" ;
    }
}
