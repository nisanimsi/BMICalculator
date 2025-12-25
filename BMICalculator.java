public class BMICalculator {

    private double weightInPounds;
    private double heightInInches;
    private double weightInKilos;
    private double heightInMeters;

    public BMICalculator() {
        this.weightInPounds = 154;
        this.heightInInches = 69;
        this.weightInKilos = 70;
        this.heightInMeters = 1.75;
    }

    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
        // Formül: (Ağırlık * 703) / Boyun karesi .
        // 703: Birim dönüşümü için kullanılan sabit değerdir.
        return (this.weightInPounds * 703) / (this.heightInInches * this.heightInInches);
    }

    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        this.weightInKilos = weightInKilos;
        this.heightInMeters = heightInMeters;
        // Formül: Ağırlık / Boyun karesi
        return this.weightInKilos / (this.heightInMeters * this.heightInMeters);
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Zayıf (Underweight)";
        } else if (bmi < 25) {
            return "Normal kilolu";
        } else if (bmi < 30) {
            return "Fazla kilolu";
        } else {
            return "Obez";
        }
    }
}
