package com.sg.dataStructures;

import java.util.Queue;

public interface MyQueue {
    void printQueue(Queue<String > queue);
    void addToQueue(Queue<Integer> queue,Integer item);
    void removeFromQueue(Queue<Integer> queue);
}
