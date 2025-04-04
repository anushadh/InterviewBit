package javaproblems.priorityQueues;

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
        PriorityQueue<Integer> myPD = new PriorityQueue<>();

        for (int i = 0; i < integerQ; i++) {

            String[] stringNumbers = br.readLine().split("\\s");
            int x = Integer.parseInt(stringNumbers[0]);
            int y = Integer.parseInt(stringNumbers[1]);

            if (x == 1) {
                myPD.add(y);
            } else if (x == 2) {
                if (myPD.peek() != null) {
                    System.out.println(myPD.peek());
                } else {
                    System.out.println("-1");
                }
            } else if (x == 3) {
                myPD.poll();
            }

        }

    }
}

public class PriorityQueues {
}
