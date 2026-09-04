import java.util.*;

public class WordFrequencyReport {

    public static void printWordFrequencies(
            String feedback) {

        Set<String> stopWords =
                new HashSet<>(
                        Arrays.asList(
                                "the",
                                "was",
                                "and",
                                "it",
                                "of",
                                "to",
                                "in",
                                "is"
                        )
                );


        String cleanText =
                feedback
                        .toLowerCase()
                        .replaceAll(
                                "[.,!?;:]",
                                ""
                        );


        String[] words =
                cleanText
                        .trim()
                        .split("\\s+");


        Map<String, Integer> frequencyMap =
                new HashMap<>();


        for (String word : words) {

            if (!word.isEmpty()
                    && !stopWords.contains(
                            word)) {

                frequencyMap.put(
                        word,

                        frequencyMap.getOrDefault(
                                word,
                                0
                        ) + 1
                );
            }
        }


        List<Map.Entry<String, Integer>>
                frequencyList =
                new ArrayList<>(
                        frequencyMap.entrySet()
                );


        frequencyList.sort(
                (first, second) ->
                        second.getValue()
                                .compareTo(
                                        first.getValue()
                                )
        );


        for (Map.Entry<String, Integer>
                entry : frequencyList) {

            System.out.println(
                    entry.getKey()
                            + ": "
                            + entry.getValue()
            );
        }
    }


    public static void main(String[] args) {

        String input =
                "The mentor was great, "
                        + "the session was great "
                        + "and clear.";


        System.out.println(
                "Feedback: \""
                        + input
                        + "\"\n"
        );


        printWordFrequencies(
                input
        );
    }
}