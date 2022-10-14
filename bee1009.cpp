/*******************************************
1009

Make a program that reads a seller's name, his/her fixed salary and the sale's total made 
by himself/herself in the month (in money). Considering that this seller receives 15% 
over all products sold, write the final salary (total) of this seller at the end of the month , 
with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.

Input
The input file contains a text (employee's first name), and two double precision values, 
that are the seller's salary and the total value sold by him/her.

Output
Print the seller's total salary, according to the given example.
*******************************************/

#include <iostream>
#include <string>

int main()
{
    std::string nome;
    double salario_fixo, tot_vendas, total_a_receber;

    std::cin >> nome >> salario_fixo >> tot_vendas;

    total_a_receber = salario_fixo + (0.15 * tot_vendas);

    printf("TOTAL = R$ %.2lf\n", total_a_receber);

    return 0;
}