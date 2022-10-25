/*******************************************
1157

Read an integer N and compute all its divisors.

Input
The input file contains an integer value.

Output
Write all positive divisors of N, one value per line.
*******************************************/

#include <iostream>

using namespace std;

int main()
{
    int x;

    cin >> x;

    for (int i = 1; i <= x; i++)
    {
        if (x % i == 0)
            cout << i << endl;
    }
    
    return 0;
}