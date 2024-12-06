import java.util.Random;
import java.util.Scanner;

public class UjianUKLSedang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] operators = { "x", ":", "%" };

        while (true) {
            int bilanganPertama = random.nextInt(10) + 1; 
            int bilanganKedua = random.nextInt(10) + 1;   
            String operator = operators[random.nextInt(operators.length)];
            int jawaban = 0;

            switch (operator) {
                case "x":
                    jawaban = bilanganPertama * bilanganKedua;
                    break;
                case ":":
                    jawaban = bilanganPertama / bilanganKedua;
                    break;
                case "%":
                    jawaban = bilanganPertama % bilanganKedua;
                    break;
            }

            System.out.print(bilanganPertama + " " + operator + " " + bilanganKedua + " = ?\n");
            System.out.print("Jawab (atau ketik 'stop' untuk berhenti): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Kuis dihentikan.");
                break;
            }

            try {
                int jawabanUser  = Integer.parseInt(input);
                if (jawabanUser  == jawaban) {
                    System.out.println("Jawaban Anda benar!");
                } else {
                    System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawaban);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau 'stop' untuk menghentikan.");
            }
        }

        scanner.close();
    }
}