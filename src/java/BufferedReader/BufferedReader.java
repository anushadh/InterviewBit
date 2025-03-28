package java.BufferedReader;

import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        //your code goes here

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print(Integer.parseInt(br.readLine()));
        System.out.print(" ");
        System.out.print(Integer.parseInt(br.readLine()));

    }
}
