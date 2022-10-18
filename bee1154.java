/*******************************************
1154

Write an algorithm to read an undeterminated number of data, each containing an individual's age. 
The final data, which will not enter in the calculations, contains the value of a negative age. 
Calculate and print the average age of this group of individuals.

Input
The input contains an undetermined number of integers. 
The input will be stop when a negative value is read.

Output
The output contains a value corresponding to the average age of individuals.

The average should be printed with two digits after the decimal point.
*******************************************/

import java.util.Scanner;

public class bee1154 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        int x = myObj.nextInt();
        double media = x;
        int count = 1;
        
        while (x >= 0) {
            x = myObj.nextInt();
            if (x < 0) {
                break;
            } else {
                media += x;
                count++;
            }
        }
        
        media = media / count;
        
        System.out.printf("%.2f\n", media);
    }
}
