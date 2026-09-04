public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(
            String original,
            String typed) {

        int totalCharacters = original.length();
        int matchedCharacters = 0;

        int firstMismatchPosition = -1;

        char originalCharacter = ' ';
        char typedCharacter = ' ';

        for (int i = 0; i < totalCharacters; i++) {

            if (original.charAt(i) == typed.charAt(i)) {

                matchedCharacters++;

            } else if (firstMismatchPosition == -1) {

                firstMismatchPosition = i + 1;

                originalCharacter = original.charAt(i);

                typedCharacter = typed.charAt(i);
            }
        }

        double accuracy =
                ((double) matchedCharacters
                        / totalCharacters) * 100.0;

        if (firstMismatchPosition != -1) {

            System.out.printf(
                    "Matched: %d/%d | Accuracy: %.2f%% | "
                            + "First Mismatch at position %d "
                            + "('%c' vs '%c')%n",
                    matchedCharacters,
                    totalCharacters,
                    accuracy,
                    firstMismatchPosition,
                    originalCharacter,
                    typedCharacter
            );

        } else {

            System.out.printf(
                    "Matched: %d/%d | Accuracy: %.2f%% | "
                            + "No Mismatches%n",
                    matchedCharacters,
                    totalCharacters,
                    accuracy
            );
        }
    }

    public static void main(String[] args) {

        checkTypingAccuracy(
                "hello world",
                "hello workt"
        );

        checkTypingAccuracy(
                "coding",
                "coding"
        );
    }
}