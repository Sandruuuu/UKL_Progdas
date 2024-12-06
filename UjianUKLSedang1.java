public class UjianUKLSedang1 {
    public static double hitungTabung(double radius, double tinggi) {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    public static void hitungLingkaran(double jariJari, double[] luas) {
        luas[0] = Math.PI * Math.pow(jariJari, 2);
    }
    
    public static void main(String[] args) {
        double radius = 5.0; 
        double tinggi = 10.0;  
        
        double volume = hitungTabung(radius, tinggi);
        System.out.println("Volume tabung dengan jari-jari " + radius + " dan tinggi " + tinggi + " adalah: " + volume);

        double jariJari = 5.0;
        double[] luas = {0.0}; 
        hitungLingkaran(jariJari, luas); 
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas[0]);
    }
}