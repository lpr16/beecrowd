/*******************************************
1003

Read two integer values, in this case, the variables A and B. After this, 
calculate the sum between them and assign it to the variable SOMA. Write the value of this variable.

Input
The input file contains 2 integer numbers.

Output
Print the message "SOMA" with all the capital letters, 
with a blank space before and after the equal signal followed by the corresponding value to the sum of A and B.
 *******************************************/

import java.util.Scanner;

public class bee1003
{
    public static void main(String[] args)
    {
        int A, B, SOMA;
        
        Scanner myObj = new Scanner(System.in);
        A = myObj.nextInt();
        B = myObj.nextInt();
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
    }
}
