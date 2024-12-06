import java.util.Scanner;

public class UjianUKLMudah1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = scanner.nextDouble();

        System.out.print("Masukkan berat paket (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = scanner.nextDouble();
        
        double volume = panjang * lebar * tinggi; 

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250; 
        } else {
            biayaPerKg = 6000; 
        }

        double biayaDasar = berat * biayaPerKg;

        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000; 
        }

        double totalBiaya = biayaDasar + biayaVolume;
        double totalBiayaSemua = Math.round(totalBiaya);

        System.out.println("Total biaya pengiriman: Rp " + totalBiayaSemua);
        scanner.close();
    }
}