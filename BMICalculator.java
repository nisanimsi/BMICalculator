// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // attribute/property to represent weight in Pounds
    private double weightInPounds;
    // attribute/property to represent height in Inches
    private double heightInInches;
    // attribute/property to represent weight in Kilos
    private double weightInKilos;
    // attribute/property to represent height in Meters
    private double heightInMeters;

    // Default no arguments constructor to initialize the 4 properties to some initial values
    public BMICalculator() {
        this.weightInPounds = 154;
        this.heightInInches = 69;
        this.weightInKilos = 70;
        this.heightInMeters = 1.75;
    }

    // Method that calculates the BMI using the Imperial system, taking in weight in Pounds and height in Inches
    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        // Setting the attributes with the values passed in as method arguments
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
        // Calculating and returning the BMI value in the Imperial system
        return (this.weightInPounds * 703) / (this.heightInInches * this.heightInInches);
    }

    // Method that calculates the BMI using the Metric system, taking in weight in Kilos and height in Meters
    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        // Setting the attributes with the values passed in as method arguments
        this.weightInKilos = weightInKilos;
        this.heightInMeters = heightInMeters;
        // Calculating and returning the BMI value in the Metric system
        return this.weightInKilos / (this.heightInMeters * this.heightInMeters);
    }

    // Method that takes in the BMI value and returns the BMI category based on it
    public String getBMICategory(double bmi) {
        if (bmi < 18.5) { // checking if the BMI value is less than 18.5
            return "Underweight"; // Returning that the BMI category is Underweight
        } else if (bmi < 25) { // checking if the BMI value is less than 25
            return "Normal weight"; // Returning that the BMI category is Normal weight
        } else if (bmi < 30) { // checking if the BMI value is less than 30
            return "Overweight"; // Returning that the BMI category is Normal Overweight
        } else {
            return "Obese"; // Returning that the BMI category is Obese when the bmi value is 30 or above
        }
    }
}
