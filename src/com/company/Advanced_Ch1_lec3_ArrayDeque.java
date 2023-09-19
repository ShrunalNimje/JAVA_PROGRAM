package com.company;
import java.util.ArrayDeque;

public class Advanced_Ch1_lec3_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> Ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> Ad2 = new ArrayDeque<>();

        // adding an element
        Ad1.add(12);
        Ad1.add(13);

        // addFirst & offerFirst method used to add element at the first
        Ad1.offerFirst(10);
        Ad1.addFirst(2);

        // addLast & offerLast method used to add element at the last
        Ad1.addLast(67);
        Ad1.offerLast(79);
        System.out.println(" ArrayDeque 1 is : " + Ad1);

        // adding an element
        Ad2.add(23);
        Ad2.add(34);

        // addFirst & offerFirst method used to add element at the first
        Ad2.offerFirst(115);
        Ad2.addFirst(4);

        // addLast & offerLast method used to add element at the last
        Ad2.addLast(87);
        Ad2.offerLast(129);
        System.out.println(" ArrayDeque 2 is : " + Ad2);

        // adding all element of Ad1 to Ad2
        Ad2.addAll(Ad1);
        System.out.println("ArrayDeque 2 after adding all element of ArrayDeque 1 : " + Ad2);

        // to access first & last element
        System.out.println(Ad1.getFirst());
        // System.out.println(Ad1.peekFirst());
        System.out.println(Ad2.getLast());
        // System.out.println(Ad2.peekLast());

        // to remove first & last element
        Ad1.removeFirst();
        Ad2.pollFirst();
        Ad1.removeLast();
        Ad2.pollLast();
        System.out.println("After removing first & last element of ArrayDeque 1 : " + Ad1);
        System.out.println("After removing first & last element of ArrayDeque 2 : " + Ad2);

        /*
        ArrayDeque is used for insertion & deletion of Queue from first and last...
        There are no capacity restrictions for ArrayDeque, and it provides us the facility to add or remove any element from both sides of the queue
         */
    }
}
