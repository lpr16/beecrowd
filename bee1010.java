/*******************************************
1006

In this problem, the task is to read a code of a product 1, the number of units of product 1, 
the price for one unit of product 1, the code of a product 2, the number of units of product 2 
and the price for one unit of product 2. After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: 
two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where 
"Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. 
The value must be presented with 2 digits after the point.
*******************************************/

import java.util.Scanner;

public class bee1010 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        int peca1_cod = myObj.nextInt();
        int peca1_qtd = myObj.nextInt();
        double peca1_preco = myObj.nextDouble();
        
        int peca2_cod = myObj.nextInt();
        int peca2_qtd = myObj.nextInt();
        double peca2_preco = myObj.nextDouble();
        
        double valor = peca1_qtd * peca1_preco + peca2_qtd * peca2_preco;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
    }
}