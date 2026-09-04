import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {

        // Store the frequency of every character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : text.toCharArray()) {
            frequencyMap.put(
                    character,
                    frequencyMap.getOrDefault(character, 0) + 1
            );
        }

        // Find the first character that occurs only once
        for (char character : text.toCharArray()) {

            if (frequencyMap.get(character) == 1) {
                return character;
            }
        }

        return '\0';
    }

    public static void checkString(String input) {

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {

            System.out.println(
                    "Input: \"" + input
                            + "\" -> First Non-Repeating Character: '"
                            + result + "'"
            );

        } else {

            System.out.println(
                    "Input: \"" + input
                            + "\" -> No Non-Repeating Character Found"
            );
        }
    }

    public static void main(String[] args) {

        checkString("swiss");

        checkString("aabbcc");
    }
}