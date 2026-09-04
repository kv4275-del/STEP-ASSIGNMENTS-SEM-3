public class ReverseCustomerName {

    public static String reverseCustomerName(String customerName) {

        char[] characters = customerName.toCharArray();

        char[] reversed = new char[characters.length];

        for (int i = 0; i < characters.length; i++) {

            reversed[i] =
                    characters[characters.length - 1 - i];
        }

        return new String(reversed);
    }

    public static void main(String[] args) {

        String name = "Sunil";

        String reversedName =
                reverseCustomerName(name);

        System.out.println("Original Name: " + name);

        System.out.println(
                "Reversed Name: " + reversedName
        );
    }
}