/*******************************************
1019

Read an integer value, which is the duration in seconds of a certain event in a factory, 
and inform it expressed in hours:minutes:seconds.

Input
The input file contains an integer N.

Output
Print the read time in the input file (seconds) converted in hours:minutes:seconds 
like the following example.
 *******************************************/

#include <iostream>

using namespace std;

int main()
{
    int seg, hora, min;

    cin >> seg;

    hora = seg / 3600;
    seg = seg % 3600;

    min = seg / 60;
    seg = seg % 60;

    cout << hora << ":" << min << ":" << seg << endl;

    return 0;
}