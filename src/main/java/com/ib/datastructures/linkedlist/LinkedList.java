package com.ib.datastructures.linkedlist;

public abstract class LinkedList<T> {

    public abstract int size();
    public abstract void insertAt(int index, T value);
    public abstract T remove(T value);
    public abstract T removeAt(int index);
    public abstract void append(T value);
    public abstract void prepend(T value);
    public abstract T get(int index);
}