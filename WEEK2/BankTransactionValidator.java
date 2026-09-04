public class BankTransactionValidator {

    public static String normalizeReference(
            String raw) {

        String trimmed = raw.trim();

        if (trimmed.length() < 3) {

            return trimmed.toUpperCase();
        }

        return trimmed.substring(0, 3)
                .toUpperCase()
                + trimmed.substring(3);
    }

    public static String validateAndFormat(
            String reference) {

        if (reference.length() != 14) {

            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(
                    reference.charAt(i))) {

                return "Invalid: "
                        + "bank code must be "
                        + "3 letters";
            }
        }

        for (int i = 3;
             i < 14;
             i++) {

            if (!Character.isDigit(
                    reference.charAt(i))) {

                return "Invalid: non-digit body";
            }
        }

        String bankCode =
                reference.substring(0, 3);

        String day =
                reference.substring(3, 5);

        String month =
                reference.substring(5, 7);

        String year =
                reference.substring(7, 9);

        String sequence =
                reference.substring(9, 14);

        StringBuilder builder =
                new StringBuilder();

        builder.append("[")
                .append(bankCode)
                .append("] ")

                .append("DATE: ")
                .append(day)
                .append("/")
                .append(month)
                .append("/")
                .append(year)

                .append(" | SEQ: ")
                .append(sequence);

        return builder.toString();
    }

    public static void processReference(
            String raw) {

        String normalized =
                normalizeReference(raw);

        String result =
                validateAndFormat(
                        normalized
                );

        System.out.println(
                "Input: \""
                        + raw
                        + "\" -> "
                        + result
        );
    }

    public static void main(String[] args) {

        processReference(
                "  hdf03022600042  "
        );

        processReference(
                "12F03022600042"
        );
    }
}