public class UjianUKLSulit2 {
    public static void main(String[] args) {
            int[] array = {1, 2, 2, 3, 3, 3, 4};
            hitungFrekuensi(array);
        }
    
        public static void hitungFrekuensi(int[] array) {
            int max = 0;
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
    
            int[] frekuensi = new int[max + 1];
    
            for (int num : array) {
                frekuensi[num]++;
            }
    
            for (int i = 1; i < frekuensi.length; i++) {
                if (frekuensi[i] > 0) {
                    System.out.println(i + " muncul " + frekuensi[i] + " kali");
            }
        }
    }
}
