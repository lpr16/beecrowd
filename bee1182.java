import java.util.Scanner;

public class bee1182 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        double[][] arr = new double[12][12];

        int col = myObj.nextInt();
        String op = myObj.next();

        double avg = 0;
        double sum = 0;

        for(int i = 0; i <= 11; i++) {
            for(int j = 0; j <= 11; j++) {
                arr[i][j] = myObj.nextDouble();
            }
        }

        for(int l = 0; l <= 11; l++) {
            sum = sum + arr[l][col];
        }

        avg = sum / 12;

        if(op.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", avg);
        }
    }
}