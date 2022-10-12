/*******************************************
1006

Read three values (variables A, B and C), which are the three student's grades. 
Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 
and the grade C has weight 5. Consider that each grade can go from 0 to 10.0, 
always with one decimal place.

Input
The input file contains 3 values of floating points (double) with one digit after the decimal point.

Output
Print the message "MEDIA"(average in Portuguese) and the student's average 
according to the following example, with a blank space before and after the equal signal.
*******************************************/

import java.util.Scanner;

public class bee1006 {
    public static void main(String[] args) {
        double A, B, C, MEDIA;
        
        Scanner myObj = new Scanner(System.in);
        
        A = myObj.nextDouble();
        B = myObj.nextDouble();
        C = myObj.nextDouble();
        
        MEDIA = (2*A + 3*B + 5*C) / 10;
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
