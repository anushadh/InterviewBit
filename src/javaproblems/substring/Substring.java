package javaproblems.substring;

//Given a string A and two indices L and R print a substring consisting of all characters
//        in the inclusive range from L to R. You'll find the String class' substring
//        method helpful in completing this challenge.

import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        String stringA = sc.next();
        int intL = sc.nextInt();
        int intR = sc.nextInt();

        System.out.println(stringA.substring(intL, intR+1));

    }
}

public class Substring {
}
