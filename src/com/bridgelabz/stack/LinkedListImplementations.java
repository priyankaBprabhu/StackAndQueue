package com.bridgelabz.stack;


public class LinkedListImplementations<T>  {
    Node top;
    Node temp;
    public void add(T num) {
        Node node = new Node(num);
        Node newNode ;
        if (top != null ) {
            newNode = node;
            newNode.next =top;
        }
        top = node;
    }

    public void pop() {
         top = top.next;
    }

    public int size() {
        temp = top;
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
        return "{top= " + top + " }" ;
    }
}
