/*******************************************
1018

In this problem you have to read an integer value and calculate the smallest possible number 
of banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 
5, 2 e 1. Print the read value and the list of banknotes.

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, 
as the given example. Do not forget to print the end of line after each line, 
otherwise you will receive “Presentation Error”.
 *******************************************/

#include <iostream>

int main()
{
    int dinheiro, dinheiro1, n100, n50, n20, n10, n5, n2, n1;

    std::cin >> dinheiro;

    dinheiro1 = dinheiro;

    n100 = dinheiro / 100;
    dinheiro = dinheiro % 100;
    
    n50 = dinheiro / 50;
    dinheiro = dinheiro % 50;

    n20 = dinheiro / 20;
    dinheiro = dinheiro % 20;

    n10 = dinheiro / 10;
    dinheiro = dinheiro % 10;

    n5 = dinheiro / 5;
    dinheiro = dinheiro % 5;

    n2 = dinheiro / 2;
    dinheiro = dinheiro % 2;

    n1 = dinheiro;

    std::cout << dinheiro1 << std::endl;
    std::cout << n100 << " nota(s) de R$ 100,00" << std::endl;
    std::cout << n50 << " nota(s) de R$ 50,00" << std::endl;
    std::cout << n20 << " nota(s) de R$ 20,00" << std::endl;
    std::cout << n10 << " nota(s) de R$ 10,00" << std::endl;
    std::cout << n5 << " nota(s) de R$ 5,00" << std::endl;
    std::cout << n2 << " nota(s) de R$ 2,00" << std::endl;
    std::cout << n1 << " nota(s) de R$ 1,00" << std::endl;

    return 0;
}