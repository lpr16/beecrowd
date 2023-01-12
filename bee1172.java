/*******************************************
1172

Read an array X[10]. After, replace every null or negative number of X ​by 1. 
Print all numbers stored in the array X.

Input
The input contains 10 integer numbers. These numbers ​​can be positive or negative.

Output
For each position of the array, print "X [i] = x", where i is the position of the array and x 
is the number stored in that position.
*******************************************/

import java.util.Scanner;

class bee1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[10];
        
        for (int i = 0; i <= 9; i++) {
            x[i] = sc.nextInt();
            
            if (x[i] == 0 || x[i] < 1) {
                x[i] = 1;
            }
            
            System.out.println("X[" + i + "] = " + x[i]);
        }
    }
}