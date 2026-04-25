package org.example.Recursions.SimpleExamples;

public class Factorial {
    public static void main(String[] args) {
        int num = 8;
        System.out.println("Factorial of " + num + " is -> " + fact(num));
    }
    static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return (n * fact(n - 1));
    }
}
