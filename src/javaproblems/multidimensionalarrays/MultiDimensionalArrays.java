package javaproblems.multidimensionalarrays;

import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] inputArray = br.readLine().split("\\s");
        int N = Integer.parseInt(inputArray[0]);
        int M = Integer.parseInt(inputArray[1]);
        int[][] array2d = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] inputN = br.readLine().split("\\s");
            for (int j = 0; j < M; j++) {
                array2d[i][j] = Integer.parseInt(inputN[j]);
            }
        }

        for(int i = 0; i < M; i++) {
            int tempSum = 0;
            for (int j = 0; j < N; j++) {
                tempSum = tempSum + array2d[j][i];
            }
            System.out.print(tempSum);
            System.out.print(" ");
        }

    }
}

public class MultiDimensionalArrays {
}
