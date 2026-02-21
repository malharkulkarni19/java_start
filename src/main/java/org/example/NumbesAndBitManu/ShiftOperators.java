package org.example.NumbesAndBitManu;

public class ShiftOperators {
    public static void main(String[] args) {
        System.out.println(7 << 1);   // left shift, if you do left sift by 1, the number generally got multiplied by 2
        System.out.println(9 << 2);   // doubled the multiplication, so 8 x 2 = 16 and 16 x 2 = 32
        System.out.println(5 >> 1);   // right shift, generally down by 1 means divided by 2 and rounding down to integer
        System.out.println(16 >> 1);  // 16 / 2 = 8
        System.out.println(25 >> 1);  // 12
        System.out.println(64 >> 2);  // divided by 2 and again divide by 2

        String magic = "Java";
        System.out.println(magic.substring(0,2));  // 2-0 = 2, hence only prints "Ja"

        String name = "Malhar";
        System.out.println(name.substring(1,3));   // 3-1 = 2, hence only prints "al"
    }
}
