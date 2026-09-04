public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {

        if (signalLog == null || signalLog.isEmpty()) {

            System.out.println("No signals recorded.");

            return;
        }

        char maximumCharacter =
                signalLog.charAt(0);

        int maximumStreak = 1;

        char currentCharacter =
                signalLog.charAt(0);

        int currentStreak = 1;

        for (int i = 1;
             i < signalLog.length();
             i++) {

            if (signalLog.charAt(i)
                    == currentCharacter) {

                currentStreak++;

            } else {

                if (currentStreak > maximumStreak) {

                    maximumStreak = currentStreak;

                    maximumCharacter =
                            currentCharacter;
                }

                currentCharacter =
                        signalLog.charAt(i);

                currentStreak = 1;
            }
        }

        // Check the final streak
        if (currentStreak > maximumStreak) {

            maximumStreak = currentStreak;

            maximumCharacter =
                    currentCharacter;
        }

        System.out.println(
                "Longest Streak: '"
                        + maximumCharacter
                        + "' repeated "
                        + maximumStreak
                        + " times"
        );
    }

    public static void main(String[] args) {

        findLongestStreak("RRGGGYR");

        findLongestStreak("RRRYYYG");
    }
}