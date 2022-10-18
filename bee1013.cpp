/*******************************************
1013

Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". 
Use the following formula:

MaiorAB = (a + b + abs(a - b)) / 2

Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “eh o maior”.
 *******************************************/

#include <iostream>
#include <cmath>

int main()
{
    int A, B, C, maiorAB, maiorC;

    std::cin >> A >> B >> C;

    maiorAB = (A + B + abs(A - B)) / 2;

    maiorC = (maiorAB + C + abs(maiorAB - C)) / 2;

    std::cout << maiorC << " eh o maior\n";

    return 0;
}