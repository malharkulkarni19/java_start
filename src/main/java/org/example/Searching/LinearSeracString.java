package org.example.Searching;

public class LinearSeracString {
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char m : str.toCharArray()){
            if(m == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Malhar";
        char target = 'r';
        System.out.println(search(str, target));
    }
}
