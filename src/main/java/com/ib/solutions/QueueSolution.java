package com.ib.solutions;

import com.ib.datastructures.linkedlist.*;

public class QueueSolution<T> extends FIFO<T> {
    private int length;
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        Node(T value) {
            this.value = value;
        }
        T value;
        Node<T> next = null;
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        this.length++;

        if(tail == null) {
            this.tail = node;
            this.head = node;
            return;
        }

        this.tail.next = node;
        this.tail = node;
    }

    public T dequeue() {
        if(this.head == null)
            return null;

        this.length--;

        T curHeadValue = this.head.value;
        this.head = this.head.next;

        if(this.length == 0)
            this.tail = null;

        return curHeadValue;
    }

    public T peek() {
        if(this.head == null)
            return null;

        return this.head.value;
    }

    @Override
    public int size() {
        return this.length;
    }
}
