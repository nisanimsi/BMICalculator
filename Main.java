import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner nesnesi oluşturulur
        Scanner scanner = new Scanner(System.in);
        BMICalculator calculator = new BMICalculator();

        System.out.println("=== BMI Hesaplayıcıya Hoş Geldiniz ===");
        System.out.println("Hesaplama sistemini seçiniz:");
        System.out.println("1 - Metrik Sistem (kg/metre)");
        System.out.println("2 - Imperial Sistem (libre/inç)");
        System.out.print("Seçiminiz: ");
        
        int secim = scanner.nextInt();
        double bmiSonuc = 0;

        if (secim == 1) {
            // Metrik Sistem Girişi
            System.out.print("Kilonuzu girin (kg): ");
            double kilo = scanner.nextDouble();
            System.out.print("Boyunuzu girin (metre - örn: 1.75): ");
            double boy = scanner.nextDouble();
            
            bmiSonuc = calculator.calculateBmiMetric(kilo, boy);
        } else if (secim == 2) {
            // Imperial Sistem Girişi
            System.out.print("Kilonuzu girin (libre/lbs): ");
            double kiloLbs = scanner.nextDouble();
            System.out.print("Boyunuzu girin (inç): ");
            double boyInch = scanner.nextDouble();
            
            bmiSonuc = calculator.calculateBmiImperial(kiloLbs, boyInch);
        } else {
            System.out.println("Geçersiz seçim yaptınız!");
            return;
        }
        String kategori = calculator.getBMICategory(bmiSonuc);
        System.out.println("\n------------------------------");
        System.out.printf("BMI Değeriniz: %.2f\n", bmiSonuc);
        System.out.println("Sağlık Durumunuz: " + kategori);
        System.out.println("------------------------------");

        scanner.close();
    }
}
