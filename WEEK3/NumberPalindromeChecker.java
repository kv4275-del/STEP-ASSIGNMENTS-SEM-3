import java.util.Scanner;

public class NumberPalindromeChecker {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;

        int reversedNumber = 0;

        while (number > 0) {

            int digit = number % 10;

            reversedNumber =
                    reversedNumber * 10 + digit;

            number = number / 10;
        }

        return reversedNumber == originalNumber;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            
            int number = scanner.nextInt();
            
            if (isPalindrome(number)) {
                
                System.out.println(
                        "Is the number "
                                + number
                                + " a Palindrome? Yes"
                );
                
            } else {
                
                System.out.println(
                        "Is the number "
                                + number
                                + " a Palindrome? No"
                );
            }
        }
    }
}