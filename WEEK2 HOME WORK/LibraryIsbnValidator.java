public class LibraryIsbnValidator {

    public static String normalizeCode(
            String raw) {

        String trimmed =
                raw.trim();

        if (trimmed.length() < 3) {

            return trimmed.toUpperCase();
        }

        return trimmed
                .substring(0, 3)
                .toUpperCase()
                + trimmed.substring(3);
    }


    public static String validateAndFormat(
            String code) {

        if (code.length() != 13) {

            return "Invalid: wrong length";
        }


        for (int i = 0;
             i < 3;
             i++) {

            if (!Character.isLetter(
                    code.charAt(i))) {

                return "Invalid: publisher code "
                        + "must be 3 letters";
            }
        }


        for (int i = 3;
             i < 13;
             i++) {

            if (!Character.isDigit(
                    code.charAt(i))) {

                return "Invalid: non-digit body";
            }
        }


        String publisherCode =
                code.substring(0, 3);

        String year =
                code.substring(3, 7);

        String catalogNumber =
                code.substring(7, 13);


        StringBuilder result =
                new StringBuilder();

        result.append("[")
                .append(publisherCode)
                .append("] ")

                .append("YEAR: ")
                .append(year)

                .append(" | CATALOG: ")
                .append(catalogNumber);


        return result.toString();
    }


    public static void processCode(
            String raw) {

        String normalized =
                normalizeCode(raw);

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

        processCode(
                "  pen2024004241  "
        );

        processCode(
                "12N2024004241"
        );
    }
}