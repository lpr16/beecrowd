import java.util.Scanner;

public class bee1185 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        double[][] arr = new double[12][12];

        String op = myObj.next();

        double avg = 0;
        double sum = 0;

        int count = 11;

        for(int i = 0; i <= 11; i++) {
            for(int j = 0; j <= 11; j++) {
                arr[i][j] = myObj.nextDouble();
            }
        }

        for(int i = 0; i <= 11; i++) {
            for(int j = 0; j < count && count > 0; j++) {
                if(j == count - 1) {
                    sum += arr[i][j];
                    count--;
                } else {
                    sum += arr[i][j];
                }
            }
        }

        avg = sum / 66;

        if(op.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", avg);
        }
    }
}
