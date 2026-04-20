package org.example.Recursions;

public class PrimeNumFromOneToHundred {
    static boolean isPrime(int n, int divisor){
        if(n <= 2) return n == 2;
        if(n % divisor == 0) return false;
        if(divisor * divisor > n) return true;

        return isPrime(n, divisor + 1);
    }
    static void printPrime(int current, int limit){
        if(current > limit) return;

        if(isPrime(current, 2)){
            System.out.print(current + " ");
        }
        printPrime(current + 1, limit);
    }

    public static void main(String[] args) {
        int n = 100;
        printPrime(1, n);
    }
}
