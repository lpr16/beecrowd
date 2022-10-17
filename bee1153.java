/*******************************************
1153

Read a value N. Calculate and write its corresponding factorial. 
Factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Input
The input contains an integer value N (0 < N < 13).

Output
The output contains an integer value corresponding to the factorial of N.
*******************************************/

import java.util.Scanner;

public class bee1153 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        int x = myObj.nextInt();
        
        int i = 1;
        int fact = 1;
        
        while (i <= x) {
            fact = fact * i;
            i++;
        }
        
        System.out.println(fact);
    }
}