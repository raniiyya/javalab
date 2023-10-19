import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        float heightDavurova = scanner.nextFloat();

        System.out.print("Enter your weight in kilograms: ");
        float weightDavurova = scanner.nextFloat();

        scanner.close();

        float bmi = weightDavurova / (float) Math.pow(heightDavurova, 2);

        if (bmi < 16.00) {
            System.out.println("BMI: " + bmi + " - Starvation");
        } else if (bmi >= 16.00 && bmi <= 16.99) {
            System.out.println("BMI: " + bmi + " - Emaciation");
        } else if (bmi >= 17.00 && bmi <= 18.49) {
            System.out.println("BMI: " + bmi + " - Underweight");
        } else if (bmi >= 18.50 && bmi <= 22.99) {
            System.out.println("BMI: " + bmi + " - Normal, low range");
        } else if (bmi >= 23.00 && bmi <= 24.99) {
            System.out.println("BMI: " + bmi + " - Normal, high range");
        } else if (bmi >= 25.00 && bmi <= 27.49) {
            System.out.println("BMI: " + bmi + " - Overweight, low range");
        } else if (bmi >= 27.50 && bmi <= 29.99) {
            System.out.println("BMI: " + bmi + " - Overweight, high range");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("BMI: " + bmi + " - 1st degree obesity");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("BMI: " + bmi + " - 2nd degree obesity");
        } else if (bmi >= 40) {
            System.out.println("BMI: " + bmi + " - 3rd degree obesity");
        }
    }
}

