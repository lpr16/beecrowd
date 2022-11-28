/*******************************************
1158

Read an integer N that is the number of test cases that follows. 
Each test case contains two integers X and Y. Print one output line for each test case 
that is the sum of Y odd numbers from X including it if is the case. For example:
for the input 4 5, the output must be 45, that is: 5 + 7 + 9 + 11 + 13
for the input 7 4, the output must be 40, that is: 7 + 9 + 11 + 13

Input
The first line of the input is an integer N that is the number of test cases that follow. 
Each test case is a line containing two integer X and Y.

Output
Print the sum of all consecutive odd numbers from X.
*******************************************/

import java.util.Scanner;

class bee1158 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        int n = myObj.nextInt();
        
        for(int i = 0; i <= n - 1; i++) {
            int a = myObj.nextInt();
            if(a % 2 == 0) {
                a += 1;
            }
            int b = myObj.nextInt();
            int c = a + 2;
            int sum = a;
        
            for(int j = 1; j <= b - 1; j++) {
                sum += c;
                c += 2;
            }
            
            System.out.println(sum);
        }
    }
}