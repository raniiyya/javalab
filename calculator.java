import java.util.Scanner;

public class calculator {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumberDavurova = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumberDavurova = scanner.nextFloat();

        scanner.close();

        float sum = firstNumberDavurova + secondNumberDavurova;
        float difference = firstNumberDavurova - secondNumberDavurova;
        float product = firstNumberDavurova * secondNumberDavurova;

        float quotient = (secondNumberDavurova != 0) ? (firstNumberDavurova / secondNumberDavurova) : 0;

        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);
        System.out.printf("Quotient: %.2f%n", quotient);
    }
}
