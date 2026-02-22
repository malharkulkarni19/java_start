package org.example.NumbesAndBitManu;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 128;

        if (num <= 0) {
            System.out.println("Not a power of two");
            return;
        }

        int bit_count = 0;

        while(num > 0){
            int lsb = num & 1;
            if(lsb == 1){
                bit_count++;
                if(bit_count > 1){
                    System.out.println("Not a power of two");
                    return;
                }
            }
            num = num >> 1;
        }
        System.out.println("Number is power of two");
    }
}
