/*******************************************
1149

Write an algorithm to read a value A and a value N. Print the sum of N numbers from A (inclusive). 
While N is negative or ZERO, a new N (only N) must be read. All input values are in the same line.

Input
The input contains only integer values, ​​can be positive or negative.

Output
The output contains only an integer value.
*******************************************/

#include <iostream>

int main()
{
    int a, n, i, sum, m;
    scanf("%d%d", &a, &n);
    sum = a;
    m = a;
    while (n < 0 || n == 0)
    {
        scanf("%d", &n);
    }

    for (i = 1; i <= n - 1; i++)
    {
        m++;
        sum = sum + m;
    }
    printf("%d\n", sum);

    return 0;
}