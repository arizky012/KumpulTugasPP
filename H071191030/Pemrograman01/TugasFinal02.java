import java.util.Scanner;

public class TugasFinal02 {

    public static void main(String[] args) {
        Scanner ka = new Scanner(System.in);

        // Baris dan kolom matriks A
        System.out.println("Masukkan ukuran matriks A");
        System.out.print("p = ");
        int p = ka.nextInt(); // Baris A
        System.out.print("q = ");
        int q = ka.nextInt(); // Kolom A
        int matriksA[][] = new int[p][q];

        // Baris dan kolom matriks B
        System.out.println("Masukkan ukuran matriks B");
        System.out.print("r = ");
        int r = ka.nextInt(); // Baris B
        System.out.print("s = ");
        int s = ka.nextInt(); // Kolom B
        int matriksB[][] = new int[r][s];

        System.out.println();

        // matriks A
        System.out.println("Masukkan elemen matriks A");
        for (int a = 0; a < p; a++) {
            for (int b = 0; b < q; b++) {
                matriksA[a][b] = ka.nextInt();
            }
        }

        // matriks B
        System.out.println("Masukkan elemen matriks B");
        for (int c = 0; c < r; c++) {
            for (int d = 0; d < s; d++) {
                matriksB[c][d] = ka.nextInt();
            }
        }

        System.out.println();

        // Matriks A*B

        if (q == r) {

            System.out.println("Hasil Perkalian Matriks A dan B :");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    int hasil = 0;
                    for (int k = 0; k < r; k++) {
                        hasil += matriksA[i][k] * matriksB[k][j];
                    }
                    System.out.print(hasil + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Perkalian matriks A*B tidak bisa dilakukan karena kolom A tidak sama dengan baris B");
        }

        System.out.println();
        // Matriks B*A
        if (p == s) {
            System.out.println("Hasil perkalian matriks B dan A");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < q; j++) {
                    int hasil = 0;
                    for (int k = 0; k < p; k++) {
                        hasil += matriksB[i][k] * matriksA[k][j];
                    }
                    System.out.print(hasil + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Perkaliam matriks B*A tidak bisa dilakukan karena kolom B tidak sama dengan baris A");
        }

        ka.close();

    }
}