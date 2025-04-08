package javaproblems.bigdecimalcomparison;


//Given an array, s, of n real number strings, sort them in descending order — but wait,
// there's more! Each number must be printed in the exact same format as it was read
// from stdin, meaning that .1  is printed as .1, and 0.1 is printed as 0.1.
// If two numbers represent numerically equivalent values (e.g. .1 is equivalent to 0.1),
// then they must be listed in the same order as they were received as input).
//
//Complete the code in the editor below.
// You must rearrange array s's elements according to the instructions above.

/*

Input Format

The first line will consist an integer n, each of the next n lines will contain a real number. n will be at most 200.
The numbers can have at most 300 digits!

Output Format

Print the numbers in descending orders, one number in each line.

Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
*/

import java.lang.*;
import java.util.*;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here

        //     Arrays.sort(s, new Comparator<Object>() {
        //    @Override
        //    public int compare(Object a1, Object a2) {
        //        BigDecimal bigDec1 = new BigDecimal((String)a1);
        //        BigDecimal bigDec2 = new BigDecimal((String)a2);
        //        return bigDec2.compareTo(bigDec1);
        //    }
        //    });

        Comparator <String> myComparator = new Comparator<String>() {
            public int compare(String o1, String o2)
            {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s,0,n,myComparator);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
}
public class BigDecimalComparison {
}
