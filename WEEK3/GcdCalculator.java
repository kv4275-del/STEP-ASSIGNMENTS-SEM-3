import java.util.Scanner;

public class GcdCalculator {

    public static int findGcd(
            int number1,
            int number2) {

        while (number2 != 0) {

            int remainder =
                    number1 % number2;

            number1 = number2;

            number2 = remainder;
        }

        return number1;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(
                    "Enter first number: "
            );
            
            int number1 =
                    scanner.nextInt();
            
            System.out.print(
                    "Enter second number: "
            );
            
            int number2 =
                    scanner.nextInt();
            
            int originalNumber1 =
                    number1;
            
            int originalNumber2 =
                    number2;
            
            int gcd =
                    findGcd(
                            number1,
                            number2
                    );
            
            System.out.println(
                    "The GCD of "
                            + originalNumber1
                            + " and "
                            + originalNumber2
                            + " is "
                            + gcd
            );
        }
    }
}