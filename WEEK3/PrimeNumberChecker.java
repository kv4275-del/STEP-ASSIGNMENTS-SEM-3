import java.util.Scanner;

public class PrimeNumberChecker {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            
            int number = scanner.nextInt();
            
            if (isPrime(number)) {
                
                System.out.println(
                        "Is the number "
                                + number
                                + " a Prime number? Yes"
                );
                
            } else {
                
                System.out.println(
                        "Is the number "
                                + number
                                + " a Prime number? No"
                );
            }
        }
    }
}