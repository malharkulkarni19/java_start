package org.example.Recursions.SimpleExamples;

public class PrintOneToN {
    public static void main(String[] args){
        printRev(5  );
    }
    static void print(int num){
        if(num == 0){
            return;
        }

        System.out.print(num + " ");
        print(num - 1);
    }
    static void printRev(int num){
        if(num == 0){
            return;
        }

        print(num - 1);
        System.out.print(num + " ");
    }
}
