package org.example.StringMain;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // faster than stringbuffer, used for single threaded operations.
        sb.append("Hello, I am Malhar! "); //you can call StringBuilder as a industry standard
        sb.append("How are you?");
        System.out.println(sb);
    }
}
