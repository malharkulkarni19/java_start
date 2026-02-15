package org.example;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 110
                ;

        if(num == 0){
            System.out.println("Zero");
        }
        else if(num < 0){
            System.out.println("Sorry, negative number");
        }
        else if(num % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
