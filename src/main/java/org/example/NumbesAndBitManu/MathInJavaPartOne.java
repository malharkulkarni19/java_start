package org.example.NumbesAndBitManu;

public class MathInJavaPartOne {
    public static void main(String[] args) {
        int num1 = 12;
        System.out.println(Integer.toBinaryString(num1));  //convert it to binary number

        int num2 = 5;
        System.out.println(Integer.toBinaryString(num2));
//        System.out.println(Integer.toHexString(num2));
//        System.out.println(Integer.toOctalString(num2));

        System.out.println(Integer.toString(10, 2));  // 10 to base 2 means converting 10 to binary
        System.out.println(Integer.toString(23, 2));

        System.out.println(Integer.parseInt("1010", 2));  // convert binary to int by this methode and 2 is base, that is binary
        System.out.println(Integer.parseInt("1110", 2));
        System.out.println(Integer.toString(31, 16));  // answer is 1f, that is 31 in int
    }
}
