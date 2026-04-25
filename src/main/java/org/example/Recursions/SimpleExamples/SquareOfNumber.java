package org.example.Recursions.SimpleExamples;

public class SquareOfNumber {
    public static void main(String[] args) {
        int num = 11;
        System.out.println("The square of " + num + " is -> " + square(num));
    }
    static int square(int num) {
        if(num < 0){
            num = -num;
        }
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return square(num - 1) + (2 * num - 1);
    }
}
