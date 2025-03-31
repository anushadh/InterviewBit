package javaproblems.arraylist;

import java.lang.*;
import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        ArrayList input = new ArrayList<>();
        int x = 0;
        while((x = Integer.parseInt(br.readLine())) > 0) {
            input.add(x);
        }
        for (int i = input.size() - 1 ; i >= 0; i --) {
            System.out.print(input.get(i));
            System.out.print(" ");

        }
    }
}

public class ArrayListJava {
}
