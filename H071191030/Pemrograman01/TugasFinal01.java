import java.util.Scanner;

public class TugasFinal01 {

    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);

        int data[] = new int[10];
        double error = 0;
        double sum = 0;
        int i;

        System.out.println("Masukkan 10 data:");
        for (i = 0; i < data.length; i++) {
            data[i] = ka.nextInt();
            sum += data[i];
        }

        System.out.println("+-----------------------------------------------+");
        System.out.println("|\tNo\t|\tData\t|\tError\t|");
        System.out.println("+-----------------------------------------------+");

        double avg = sum / 10;

        for (i = 0; i < data.length; i++) {
            error = Math.sqrt(Math.pow((avg - data[i]), 2));
            System.out.printf("|\t%d\t|\t%d\t|\t%.3f\t|\n", (i + 1), data[i], error);

        }
        System.out.println("+-----------------------------------------------+");

        ka.close();

    }
}