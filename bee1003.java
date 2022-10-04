import java.util.Scanner;

public class Main
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