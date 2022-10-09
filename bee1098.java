/*******************************************
1098

Make a program that prints the sequence like the following example.

Input
This problem doesn't have input.

Output
Print the sequence like the example below. 

I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?

*******************************************/

public class bee1098 
{
    public static void main(String[] args) 
    {
        double i, j;
        
        i = 0;
        j = 1;
        
        for (i = 0; i <= 2; i += 0.2)
        {
            j = j + i;
            
            for (int k = 0; k <= 2; k++)
            {
                if (i == 0 || i == 1 || i > 1.99)
                {
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                    j++;
                    if (k == 2) j = 1;
                }
                        
                else
                {   
                    System.out.printf("I=%.1f J=%.1f\n", i, j);
                    j++;
                    if (k == 2) j = 1;
                }
            }
        }
    }
}