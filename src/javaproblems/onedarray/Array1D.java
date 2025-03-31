package javaproblems.onedarray;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Array1D {
}



class Main {
    public static void main(String[] args) throws IOException {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int N = Integer.parseInt(br.readLine());
        int[] inputArray = new int[N];

        for (int i = 0; i < N; i++) {
            inputArray[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N-1; i >= 0; i--) {
            System.out.println(inputArray[i]);
        }

    }
}
