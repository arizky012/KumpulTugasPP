//Tugas Final 01

import java.util.Scanner;

class Tugas01FinalH071191020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array = new int [10];
        double total = 0;
        double rata2 = 0;

        for (int i = 0; i < 10; i++) {
            array [i] = in.nextInt();
            total = total + array[i];
        }
        rata2 = total/10;
    
        System.out.println("==========================================");
        System.out.println("No\t||\tData\t||\tError\t||");
        System.out.println("==========================================");

        double [] error = new double [10];

        for (int i = 0; i < 10 ; i++) {
            error[i] = Math.sqrt(Math.pow(rata2-array[i], 2));
            System.out.printf("%d\t||\t%d\t||\t%.3f\t||", i+1, array[i], error[i]);
            System.out.println();
        }
        System.out.println("==========================================");
    }
}