package queues;

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
        Queue<Integer> myQueue = new ArrayDeque<>();

        for (int i = 0; i < integerQ; i++) {
            String[] s = br.readLine().split("\\s");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            if (x == 1) {
                myQueue.add(y);
            }

            if (x == 2) {
                if(!myQueue.isEmpty()) {
                    System.out.println(myQueue.element());
                } else {
                    System.out.println(-1);
                }
            }

            if (x == 3 && !myQueue.isEmpty()) {
                myQueue.remove();
            }
        }
    }
}

public class Queues {
}
