import java.util.Scanner;

public class Equation_square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        double A = scanner.nextDouble();

        if (A==0) {
            System.out.println ("A can not be zero for a quadratic equation");
            return;

        }

        System.out.print("Enter the value of B: ");
        double B = scanner.nextDouble();
        System.out.print("Enter the value of C: ");
        double C = scanner.nextDouble();

        double discriminant = B * B - 4 * A * C;

        double x1 = 0;
        double x2 = 0;

        int numberOfRoots;
        if (discriminant > 0) {
            numberOfRoots = 2;
            x1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            x2 = (-B - Math.sqrt(discriminant)) / (2 * A);
        } else if (discriminant == 0) {
            numberOfRoots = 1;
            x1 = -B / (2 * A);
        } else {
            numberOfRoots = 0;
        }

        // Display the results with two decimal places
        System.out.printf("a: %.2f%n", A);
        System.out.printf("b: %.2f%n", B);
        System.out.printf("c: %.2f%n", C);

        switch (numberOfRoots) {
            case 2:
                System.out.printf("x1: %.2f%n", x1);
                System.out.printf("x2: %.2f%n", x2);
                break;
            case 1:
                System.out.printf("x1: %.2f%n", x1);
                break;
            case 0:
                System.out.println("No real roots.");
                break;
        }
    }
}
