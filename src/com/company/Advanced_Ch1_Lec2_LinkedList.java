package com.company;
import java.util.*;

public class Advanced_Ch1_Lec2_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();

        // Adding an element
        ll1.add(11);
        ll1.add(12);
        ll1.add(13);
        ll1.add(14);
        ll1.add(15);
        ll1.add(16);

        ll2.add(114);
        ll2.add(115);
        ll2.add(116);

        // Adding an element at specific index
        ll1.add(3,20);
        ll2.add(1,234);

        System.out.println("LinkedList 1 is : "+ll1);
        System.out.println("LinkedList 2 is : "+ll2);

        // Adding all element of ll2 to ll1
        ll1.addAll(ll2);
        System.out.println("After adding elements of LinkedList 2 is : " + ll1);

        // adding first and last element
        ll2.addFirst(234);
        ll2.addLast(345);
        System.out.println("After adding first & last elements to LinkedList 2 is : " + ll2);

        // remove an element
        ll2.remove(1);
        ll2.remove(3);
        System.out.println("After removing element of first & third index of LinkedList 2 is : " + ll2);


        // set an element --> this method remove an element of existing LinkedList...
        // set() method is used to change an already existing element of a linked list...
        ll1.set(3,35);
        System.out.println("After set an element to ll1 : "+ll1);

        // clear all the elements
        ll1.clear();
        ll2.clear();
        System.out.println("After clear all the element of ll1 : "+ll1);
        System.out.println("After clear all the element of ll2 : "+ll2);

        /*
        Although ArrayList & LinkedList both implement the List interface and have the same methods, it is important to understand when to use which one.
        The insertion & deletion can be done in constant time in Linked List, so it is best to use the linked list when you need to add or remove elements frequently.
                Use ArrayList when you want to access the random elements frequently, as it can’t be done in a linked list in constant time.
         */

        // Implementing linked list through queue interface
        Queue<Integer> queue = new LinkedList<>();

        // Adding element to linked list from rear
        queue.offer(12);
        queue.offer(22);
        queue.offer(32);

        System.out.println("LinkedList : " + queue);

        // Remove element to linked list from front
        System.out.println(queue.poll());
        System.out.println("LinkedList : " + queue);

        // Get top element
        System.out.println("Top element : " + queue.peek());
        System.out.println("LinkedList : " + queue);

        // there are also three methods add(), remove() and element() same as offer(), poll() and peek(),
        // but they throw exception if task not completed as expected

        // Implementing linked list through list interface
        List<Integer> AI = new LinkedList<>();
        List<Integer> AI2 = new LinkedList<>();
        // Adding an element
        AI.add(3);
        AI.add(4);
        AI.add(5);
        AI.add(8);
        AI2.add(12);
        AI2.add(14);
        AI2.add(30);

        // Adding an element at specific index
        AI.add(3,3);

        System.out.println("ArrayList 1 is : " + AI);
        System.out.println("ArrayList 2 is : " + AI2);

        // Adding all element of AI2 to AI
        AI.addAll(2,AI2);
        System.out.println("After adding elements of ArrayList 2 is : " + AI);

        // First method to print ArrayList...
        for (int i = 0; i < AI.size(); i++) {
            System.out.println("Using For loop : " + AI.get(i));
        }

        // Second method to print ArrayList...
        for (Integer e: AI){
            System.out.println(e);
        }

        // third method to print ArrayList...
        Iterator<Integer> it1 = AI.iterator();

        while(it1.hasNext()) {
            System.out.println(it1.next());
        }

        // Removing an element
        AI.remove(4);
        System.out.println("After removing an element from index 4 is : " + AI);

        AI.remove(Integer.valueOf(12));
        System.out.println("After removing an  30 value : " + AI);

        // AI.clear(); ---> clear all the elements of an ArrayList...

        // set() method is to change an already existing element of ArrayList
        AI2.set(2,234);
        System.out.println("After set an element 234 at index 2 is of ArrayList 2 : " + AI2);

        // return true if elements contains
        System.out.println("AI2 contains 45 : "+ AI2.contains(45));
        System.out.println("AI2 contains 30 : "+ AI2.contains(30));

        // tell us starting & last index of elements
        System.out.println(AI.indexOf(3));
        System.out.println(AI.lastIndexOf(3));

    }
}
