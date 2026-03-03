package org.example.Hashing;

public class HashBasics {
    public static void main(String[] args) {
        System.out.println("MA".hashCode()); // finding hashcode of given string

        System.out.println("FB".hashCode());
        System.out.println("Ea".hashCode());  //both "FB" and "Ea" generates 2236 code, this is called hash collision
    }
}
