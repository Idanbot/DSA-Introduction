package com.ib.datastructures.linkedlist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void queue(){
        FIFO<String> queue = new Queue<>();
        FIFO<String> queue2 = new Queue<>();
        queue.enqueue("5");
        queue.enqueue("7");
        queue.enqueue("9");

        assertEquals("5", queue.dequeue(), "Queue");
        assertEquals(2, queue.size(), "Queue");
        assertEquals(0, queue2.size(), "Queue");
    }

    @Test
    public void queue2(){
        FIFO<Integer> queue = new Queue<>();
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(11);

        assertEquals(7, queue.dequeue(), "Queue");
        assertEquals(9, queue.dequeue(), "Queue");
        assertEquals(11, queue.peek(), "Queue");
        assertEquals(11, queue.dequeue(), "Queue");
        assertEquals(0, queue.size(), "Queue");
        assertNull(queue.dequeue(), "Queue");

        queue.enqueue(69);
        assertEquals(69,queue.peek(),"Queue");
        assertEquals(1,queue.size(),"Queue");
    }

    @Test
    public void queue3(){
        FIFO<Integer> queue = new Queue<>();
        assertNull(queue.dequeue(), "Queue");
        assertNull(queue.peek(), "Queue");
        assertEquals(0, queue.size(), "Queue");
    }
}