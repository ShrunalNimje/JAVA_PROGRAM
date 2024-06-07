package com.company;

public class BitwiseOperator {
    public static void main(String[] args) {
        int x = 9;
        int y = 10;
        int OR = x | y;
        int AND = x & y;
        int XOR = x ^ y;
        int compliment = ~x;
        int negation = ~y;
        int rightShift = x >> 2;
        int leftShift = y << 1;

        System.out.println("Bitwise OR : " + OR);
        System.out.println("Bitwise AND : " + AND);
        System.out.println("Bitwise XOR : " + XOR);
        System.out.println("Bitwise compliment on x: " + compliment);
        System.out.println("Bitwise compliment on y: " + negation);
        System.out.println("Right Shift on x by 2 : " + rightShift);
        System.out.println("Left Shift on y by 1 : " + leftShift);
    }
}
