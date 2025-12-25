import java.util.Scanner;

public class UserInput {
    private Scanner input = new Scanner(System.in);

    public String obtainBMISystem() {
        System.out.println("=== BMI Hesaplayıcıya Hoş Geldiniz ===");
        System.out.print("Lütfen bir sistem seçin (Imperial/Metric): ");
        
        String bmiSystem = input.next();

        if (!(bmiSystem.equalsIgnoreCase("Imperial") || bmiSystem.equalsIgnoreCase("Metric"))) {
            return "";
        }
        return bmiSystem;
    }

    public double obtainWeight(String bmiSystem) {
        double weight = 0;
        boolean isInvalidInput = true;

        while (isInvalidInput) {
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL": System.out.print("Kilonuzu Libre (lbs) cinsinden girin: "); break;
                case "METRIC": System.out.print("Kilonuzu Kilogram (kg) cinsinden girin: "); break;
                case "": System.out.println("Lütfen önce geçerli bir sistem seçin."); return 0;
            }

            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Hata: Lütfen geçerli bir sayı girin!");
                input.next(); // Hatalı girişi temizlemek için
            }
        }
        return weight;
    }

    public double obtainHeight(String bmiSystem) {
        double height = 0;
        boolean isInvalidInput = true;

        while(isInvalidInput) {
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL": System.out.print("Boyunuzu inç cinsinden girin: "); break;
                case "METRIC": System.out.print("Boyunuzu metre cinsinden girin (Örn: 1.75): "); break;
            }

            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Hata: Lütfen boyunuzu sayısal olarak girin!");
                input.next();
            }
        }
        return height;
    }
}
