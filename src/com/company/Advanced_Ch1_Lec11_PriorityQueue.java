package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Advanced_Ch1_Lec11_PriorityQueue {
    public static void main(String[] args) {

        // It will implement min heap
        // Queue<Integer> pq = new PriorityQueue<>();

        // It will implement max heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(45);
        pq.offer(2);
        pq.offer(67);
        pq.offer(12);
        pq.offer(22);
        pq.offer(32);

        System.out.println("LinkedList : " + pq);

        // Remove element to linked list from front
        System.out.println(pq.poll());
        System.out.println("LinkedList : " + pq);

        // Get top element
        System.out.println("Top element : " + pq.peek());
        System.out.println("LinkedList : " + pq);
    }
}
