/*******************************************
1007

Read four integer values named A, B, C and D. Calculate and print
 the difference of product A and B by the product of C and D (A * B - C * D).

Input
The input file contains 4 integer values.

Output
Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters,
according to the following example, with a blank space before 
and after the equal signal.
 *******************************************/

import java.util.Scanner;

public class bee1007 {
    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        
        Scanner myObj = new Scanner(System.in);
        
        A = myObj.nextInt();
        B = myObj.nextInt();
        C = myObj.nextInt();
        D = myObj.nextInt();
        
        DIFERENCA = (A*B - C*D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
