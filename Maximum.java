package com.bridgelabz;

public class Maximum {

    //calculating Maximum of Three Numbers using CompareTo method
    public static int checkMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max) > 0) {
            max = y; // y is largest now
        }
        if(z.compareTo(max) > 0) {
            max = z; // z is largest now
        }
        return max; // returns maximum number
    }git

    public static void main(String[] args) {
        int c = checkMaximum(15,27,19);
        System.out.println(c);
    }
}
