package javaproblems.biginteger;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        System.out.println(a.add(b));

    }
}

public class BigIntegerSum {
}
