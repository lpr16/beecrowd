import java.util.Scanner;

public class bee1004
{
    public static void main(String[] args)
    {
        int A, B, PROD;
        
        Scanner myObj = new Scanner(System.in);
        
        A = myObj.nextInt();
        B = myObj.nextInt();
        
        PROD = A * B;
        
        System.out.println("PROD = " + PROD);
    }
}
