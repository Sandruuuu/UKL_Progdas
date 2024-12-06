import java.util.Scanner;
public class UjianUKLSulit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        double[] nilaiUjian = new double[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextDouble();
        }

        double totalNilai = 0;
        for (double nilai : nilaiUjian) {
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("Rata-rata nilai ujian adalah:" +rataRata);

        scanner.close();
    }
}
