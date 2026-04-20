package org.example.Recursions;

public class TableOfFive {
    static void table(int n){
        if(n == 75){
            System.out.println(75);
            return;
        }
        System.out.print(n + " ");
        table(n + 5);
    }

    public static void main(String[] args) {
        table(5);
    }
}
