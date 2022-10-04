/*******************************************
1002

The formula to calculate the area of a circumference is defined as A = π . R2. 
Considering to this problem that π = 3.14159:

Calculate the area using the formula given in the problem description.

Input
The input contains a value of floating point (double precision), that is the variable R.

Output
Present the message "A=" followed by the value of the variable, as in the example bellow, 
with four places after the decimal point. Use all double precision variables.
 *******************************************/

#include <iostream>
 
using namespace std;
 
int main()
{
    double const pi = 3.14159;
    double raio, area;
    
    cin >> raio;
    
    area = pi * raio * raio;
    
    printf("A=%.4f\n", area);
 
    return 0;
}