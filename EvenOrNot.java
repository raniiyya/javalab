import java.util.Random;
public class EvenOrNot {
    public static void main(String[] args) {
        int number = new Random().nextInt(99) + 1;
        System.out.println("The number is: " + number);
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an uneven number");
        }
    }
}
