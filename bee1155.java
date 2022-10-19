/*******************************************
1155

Write an algorithm to calculate and write the value of S, S being given by:
S = 1 + 1/2 + 1/3 + … + 1/100

Input
There is no input in this problem.

Output
The output contains a value corresponding to the value of S.
The value should be printed with two digits after the decimal point.
*******************************************/

public class bee1155 {
    public static void main(String[] args) {
        double x = 1;
        
        for (double i = 2; i <= 100; i++) {
            x += 1 / i;
        }
        
        System.out.printf("%.2f\n", x);
    }    
}
