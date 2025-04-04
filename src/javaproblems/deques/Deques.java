package javaproblems.deques;

import java.lang.*;
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int integerQ = Integer.parseInt(br.readLine());
        Deque<Integer> myDeque = new ArrayDeque<>();

        for (int i = 0; i < integerQ; i++) {
            String[] stringNumbers = br.readLine().split("\\s");
            int x = Integer.parseInt(stringNumbers[0]);
            int y = Integer.parseInt(stringNumbers[1]);

            if (x == 1) {
                myDeque.addLast(y);
            } else if (x == 2) {
                myDeque.addFirst(y);
            } else if (x == 3) {
                if (myDeque.peekFirst() != null) {
                    System.out.println(myDeque.peekFirst());
                } else {
                    System.out.println("-1");
                }
            } else if (x == 4) {
                if (myDeque.peekLast() != null) {
                    System.out.println(myDeque.peekLast());
                } else {
                    System.out.println("-1");
                }
            } else if (x == 5) {
                myDeque.pollFirst();
            } else if (x == 6) {
                myDeque.pollLast();
            }

        }

    }
}

public class Deques {
}
