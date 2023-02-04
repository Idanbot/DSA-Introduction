package com.ib.datastructures.linkedlist;

public abstract class FIFO<T> {

    public abstract void enqueue(T value);
    public abstract T dequeue();
    public abstract T peek();

    public abstract int size();
}
