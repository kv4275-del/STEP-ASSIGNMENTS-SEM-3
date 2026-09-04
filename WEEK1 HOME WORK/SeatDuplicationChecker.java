public class SeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {

        boolean foundDuplicate = false;

        for (int i = 0; i < seatNumbers.length; i++) {

            boolean alreadyReported = false;

            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyReported = true;
                    break;
                }
            }

            if (alreadyReported) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {

                    System.out.println(
                            "Duplicate Seat Number Found: "
                                    + seatNumbers[i]
                    );

                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        int[] hall1 = {101, 102, 103, 102, 105};

        System.out.print(
                "Input: [101, 102, 103, 102, 105] -> "
        );

        checkDuplicateSeats(hall1);


        int[] hall2 = {101, 102, 103, 104, 105};

        System.out.print(
                "Input: [101, 102, 103, 104, 105] -> "
        );

        checkDuplicateSeats(hall2);
    }
}