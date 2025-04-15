package javaproblems.bigIntegerPrime;

//A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself.
//        For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.
//
//Given a large integer, n , use the Java BigInteger class’ isProbablePrime method to
//determine and print whether it’s prime or not prime.

import java.lang.*;
import java.util.*;
import java.math.BigInteger;

 class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        //BigInteger bi = BigInteger.valueOf(n);

        if(n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}

public class BigIntegerPrime {
}
