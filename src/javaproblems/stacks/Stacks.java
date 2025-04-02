package javaproblems.stacks;

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

        int integerT = Integer.parseInt(br.readLine());

        for (int i = 0; i < integerT; i++) {
            String stringA = br.readLine();
            Stack<Character> stringStack = new Stack<>();

            for(int j = 0; j < stringA.length(); j++) {
                if(!stringStack.empty() && stringStack.peek() == '(' && stringA.charAt(j) == ')') {
                    stringStack.push(stringA.charAt(j));
                    stringStack.pop();
                    stringStack.pop();
                } else {
                    stringStack.push(stringA.charAt(j));
                }
                //System.out.println(stringStack.toString());
            }
            if(stringStack.empty()) System.out.println(1);
            else System.out.println(0);
        }

    }
}

public class Stacks {
}
