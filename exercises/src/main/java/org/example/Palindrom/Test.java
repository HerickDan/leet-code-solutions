package org.example.Palindrom;

public class Test {
    String name = "Herick";
    public static void main(){
        String numToStr = Integer.toString(121);
        String reversed = new StringBuilder(numToStr).reverse().toString();
        System.out.println(reversed.compareTo(numToStr) == 0);
    }
}
