package com.bridgelabz.stackandqueue;


public class StackMain {
    public static void main(String[] args) {
        System.out.println("Stack and Queue Implementations");
        IList<Integer> stack = new StackImplementations();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println(stack);
    }
}
