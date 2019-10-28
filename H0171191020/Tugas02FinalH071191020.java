import java.util.Scanner;

class Tugas02FinalH071191020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan ukuran matriks A");
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int [][] arrA = new int [a1][a2];
        System.out.println("Input nilai matriks A sebanyak "+(a1*a2)+ " inputan");
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                System.out.printf("Unsur A [%d,%d] :",(i+1),(j+1));
                arrA [i][j] = in.nextInt();
            }
        }
        System.out.println("Masukkan ukuran matriks B");
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int [][] arrB = new int[b1][b2];
        System.out.println("Input nilai Matriks B sebanyak " +(b1*b2)+" inputan");
        for (int i = 0; i < b1; i++) {
            for (int j = 0; j < b2; j++) {
                System.out.printf("Unsur B [%d,%d] :",(i+1),(j+1));
                arrB [i][j] = in.nextInt();
            }
        }
        System.out.println();
        //baris A harus sama dgn kolom B
        //Matrika A*B
        if (a1 == b2) {
            System.out.println("Hasil Perkalian Matriks A * B : ");
            for (int i = 0; i < a1; i++) {
                for (int j = 0; j < b1; j++) {
                    int x = 0;
                    for (int k = 0; k < a2; k++) {
                        x += arrA[i][k] * arrB[k][j];
                    }
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println("===============================");
            System.out.println("Hasil Perkalian Matriks B dan A");
            for (int i = 0; i < b1; i++) {
                for (int j = 0; j < a2; j++) {
                    int x = 0;
                    for (int k = 0; k < b2; k++) {
                        x += arrB[i][k]*arrA[k][j];
                    }
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Tidak bisa di kalikan");
        }
    }
}