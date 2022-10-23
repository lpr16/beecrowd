/*******************************************
1015

Write an algorithm to calculate and write the value of S, S being given by:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Input
There is no input in this problem.

Output
The output contains a value corresponding to the value of S.
The value should be printed with two digits after the decimal point.
*******************************************/

#include <iostream>

using namespace std;

void weird()
{
    double x = 1;
    double soma = x;
    double j = 2;

    for (int i = 3; i <= 39; i += 2)
    {
        soma += i / j;
        j *= 2;
    }

    printf("%.2lf\n", soma);
}

int main()
{
    weird();

    return 0;
}