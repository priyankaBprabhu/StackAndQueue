package com.bridgelabz.stackandqueue;


public class LinkedListImplementations<T>  {
    Node head;
    Node temp;
    public void add(T num) {
        Node node = new Node(num);
        Node newNode ;
        if (head != null ) {
            newNode = node;
            newNode.next =head;
        }
        head = node;
    }

    public void pop() {
         head = head.next;
    }

    public int size() {
        temp=head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }


    @Override
    public String toString() {
        return "{"+"head=" + head + " }" ;
    }
}
