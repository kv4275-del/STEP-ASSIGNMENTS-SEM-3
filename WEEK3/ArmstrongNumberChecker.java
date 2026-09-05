import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static boolean isArmstrong(
            int number) {

        int originalNumber =
                number;

        int temporaryNumber =
                number;

        int sum = 0;

        while (temporaryNumber > 0) {

            int digit =
                    temporaryNumber % 10;

            sum =
                    sum
                            + digit
                            * digit
                            * digit;

            temporaryNumber =
                    temporaryNumber / 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(
                    "Enter a number: "
            );
            
            int number =
                    scanner.nextInt();
            
            if (isArmstrong(number)) {
                
                System.out.println(
                        "Is the number "
                                + number
                                + " an Armstrong number? Yes"
                );
                
            } else {
                
                System.out.println(
                        "Is the number "
                                + number
                                + " an Armstrong number? No"
                );
            }
        }
    }
}