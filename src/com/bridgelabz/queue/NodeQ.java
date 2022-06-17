package com.bridgelabz.queue;

public class NodeQ<T> {
    T data;
    NodeQ next;

    public NodeQ(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node {" +
                " data = " + data +
                ", next = " + next +"}" ;
    }
}
