/*******************************************
1164

In mathematics, a perfect number is an integer for which the sum of all its own 
positive divisors (excluding itself) is equal to the number itself. 
For example the number 6 is perfect, because 1+2+3 is equal to 6. Your task is to write 
a program that read integer numbers and print a message informing if these numbers 
are perfect or are not perfect.

Input
The input contains several test cases. The first contains the number of test cases N (1 ≤ N ≤ 100). 
Each one of the following N lines contains an integer X (1 ≤ X ≤ 108), that can be or not a perfect number.

Output
For each test case print the message “X eh perfeito” (X is perfect) or “X nao eh perfeito” 
(X isn't perfect) according with to above specification.
*******************************************/

import java.util.Scanner;

class bee1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, x, sum = 0;
        
        t = sc.nextInt();
        
        while (t != 0) {
            x = sc.nextInt();
            
            for(int i = 1; i <= (x/2); i ++) {
                if (x % i == 0) {
                    sum += i;
                }
            }
            
            if (sum == x){
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
            
            sum = 0;
            t--;
        }
    }
}