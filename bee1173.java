/*******************************************
1173

Read a number and make a program which puts this number in the first position of an array N[10]. 
In each subsequent position, put the double of the previous position. For example, 
if the input number is 1, the array numbers ​​must be 1,2,4,8, and so on.

Input
The input contains an integer number V (V < 50).

Output
Print the stored number of each array position, in the form "N[i] = X", where i is the position 
of the array and x is the stored number at the position i. The first number for X is V.
*******************************************/

public class bee1173 {
    public static void main(String[ args]) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[10];
        
        x[0] = sc.nextInt();
        
        for (int i = 1; i <= 9; i++) {
            x[i] = x[i-1] * 2;
                        
            System.out.println("N[" + i + "] = " + x[i - 1]);
            
            if (i == 9) {
                System.out.println("N[" + i + "] = " + x[i]);
            }
        }
    }    
}
