/*******************************************
1012

Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, 
always with a corresponding message (in Portuguese) and one space between the two points and the value. 
The value calculated must be presented with 3 digits after the decimal point.
*******************************************/

import java.util.Scanner;

public class bee1012 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        double A, B, C;
        double PI = 3.14159;
        
        A = myObj.nextDouble();
        B = myObj.nextDouble();
        C = myObj.nextDouble();
        
        double area_triAC = A * C / 2.0;
        
        double area_cirC = PI * C * C;
        
        double area_trap = (A + B) * C / 2;
        
        double area_quaB = B * B;
        
        double area_retAB = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n", area_triAC);
        System.out.printf("CIRCULO: %.3f\n", area_cirC);
        System.out.printf("TRAPEZIO: %.3f\n", area_trap);
        System.out.printf("QUADRADO: %.3f\n", area_quaB);
        System.out.printf("RETANGULO: %.3f\n", area_retAB);
    }
}
