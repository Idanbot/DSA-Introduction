package com.ib.datastructures.linkedlist;

public class Queue<T> extends FIFO<T>{

    // TODO: Implement FIFO methods
    // A Queue is a linked list data structure that follows the FIFO (First In First Out) principle.
    // This means that the first element added to the queue will be the first one to be removed.
    // Method enqueue() adds an element to the queue.
    // Method dequeue() removes and returns the first element of the queue.
    // Method peek() returns the first element of the queue without removing it.
    // Method size() returns the number of elements in the queue.
    // What is the time complexity of each method?

    @Override
    public void enqueue(T value) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
