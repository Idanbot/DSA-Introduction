package com.ib.solutions;

import com.ib.datastructures.linkedlist.*;

public class StackSolution<T> extends LIFO<T> {

    private int length;
    private Node<T> head;

    private static class Node<T> {
        Node(T value) {
            this.value = value;
        }
        T value;
        Node<T> prev = null;
    }
    @Override
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        this.length++;

        if(this.head == null) {
            this.head = newNode;
            return;
        }

        newNode.prev = this.head;
        this.head = newNode;
    }

    @Override
    public T pop() {
        this.length = Math.max(0, this.length - 1);
        Node<T> temp;

        if(this.length == 0) {
            temp = this.head;
            this.head = null;
            return temp == null ? null : temp.value;
        }

        temp = this.head;
        this.head = temp.prev;
        return temp.value;
    }

    @Override
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
