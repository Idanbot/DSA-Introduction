package com.ib.datastructures.linkedlist;

public abstract class LIFO<T> {

    public abstract void push(T value);
    public abstract T pop();
    public abstract T peek();

    public abstract int size();
}
