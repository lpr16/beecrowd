/*******************************************
1008

Write a program that reads an employee's number, his/her worked hours number 
in a month and the amount he received per hour. 
Print the employee's number and salary that he/she will receive at end of the month, 
with two decimal places.

Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
Don’t forget the space before and after the equal signal and after the U$.
Input
The input file contains 2 integer numbers and 1 value of floating point, 
representing the number, worked hours amount and the amount the employee receives per worked hour.

Output
Print the number and the employee's salary, according to the given example, with a blank space before and after the equal signal.
 *******************************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class bee1008 
{
    public static void formatDouble(double myDouble, int rg)
    {
        int registro = rg;
    
        DecimalFormat numberFormatter = new DecimalFormat("##.00");
        String result = numberFormatter.format(myDouble);
        System.out.println("NUMBER = " + registro);
        System.out.println("SALARY = U$ " + result);
    }

    public static void main(String[] args) 
    {
        int registro, ht;
        double slph, sltt;
    
        Scanner myObj = new Scanner(System.in);
    
        registro = myObj.nextInt();
        ht = myObj.nextInt();
        slph = myObj.nextDouble();
    
        sltt = slph * ht;
    
        formatDouble(sltt, registro);
    }
}