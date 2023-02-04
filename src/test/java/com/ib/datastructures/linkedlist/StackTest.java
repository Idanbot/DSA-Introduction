package com.ib.datastructures.linkedlist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void stack(){
        LIFO<String> stack = new Stack<>();

        assertNull(stack.pop(), "Stack");
        assertEquals(0, stack.size(), "Stack");

        stack.push("5");

        assertEquals(1, stack.size(), "Stack");
        assertEquals("5", stack.peek(), "Stack");
        assertEquals("5", stack.pop(), "Stack");
        assertEquals(0, stack.size(), "Stack");

        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertEquals(3, stack.size(), "Stack");
        assertEquals("3", stack.pop(), "Stack");
        assertEquals("2", stack.pop(), "Stack");
        assertEquals("1", stack.pop(), "Stack");
        assertEquals(0, stack.size(), "Stack");
    }

    @Test
    public void stack2(){
        LIFO<String> stack = new Stack<>();
        LIFO<String> stack2 = new Stack<>();
        stack.push("5");
        stack.push("7");
        stack.push("9");

        assertEquals("9", stack.pop(), "Stack");
        assertEquals(2, stack.size(), "Stack");
        assertEquals(0, stack2.size(), "Stack");
    }

    @Test
    public void stack3(){
        LIFO<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(9);
        stack.push(11);

        assertEquals(11, stack.pop(), "Stack");
        assertEquals(9, stack.pop(), "Stack");
        assertEquals(7, stack.peek(), "Stack");
        assertEquals(7, stack.pop(), "Stack");
        assertEquals(0, stack.size(), "Stack");
        assertNull(stack.pop(), "Stack");

        stack.push(69);
        assertEquals(69,stack.peek(),"Stack");
        assertEquals(1,stack.size(),"Stack");
    }

}