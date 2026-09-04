import java.util.Random;

public class RockPaperScissorsGame {

    public static String playRound(String playerMove, String computerMove) {

        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        return switch (playerMove.toLowerCase()) {
            case "rock" -> computerMove.equalsIgnoreCase("scissors")
                ? "Player Wins"
                : "Computer Wins";
            case "paper" -> computerMove.equalsIgnoreCase("rock")
                ? "Player Wins"
                : "Computer Wins";
            case "scissors" -> computerMove.equalsIgnoreCase("paper")
                ? "Player Wins"
                : "Computer Wins";
            default -> "Invalid Move";
        };
    }

    public static void main(String[] args) {

        String[] options = {"Rock", "Paper", "Scissors"};

        String[] playerMoves = {
                "Rock",
                "Paper",
                "Scissors",
                "Rock",
                "Paper"
        };

        Random random = new Random();

        int rounds = playerMoves.length;

        String[][] history = new String[rounds][4];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 0; i < rounds; i++) {

            String playerMove = playerMoves[i];

            String computerMove =
                    options[random.nextInt(3)];

            String result =
                    playRound(playerMove, computerMove);

            switch (result) {
                case "Player Wins" -> wins++;
                case "Computer Wins" -> losses++;
                case "Draw" -> draws++;
                default -> {
                }
            }

            history[i][0] = String.valueOf(i + 1);
            history[i][1] = playerMove;
            history[i][2] = computerMove;
            history[i][3] = result;
        }

        System.out.printf(
                "%-8s | %-12s | %-14s | %-15s%n",
                "Round",
                "Player Move",
                "Computer Move",
                "Result"
        );

        System.out.println(
                "----------------------------------------------------------"
        );

        for (String[] row : history) {

            System.out.printf(
                    "%-8s | %-12s | %-14s | %-15s%n",
                    row[0],
                    row[1],
                    row[2],
                    row[3]
            );
        }

        double winPercentage =
                ((double) wins / rounds) * 100.0;

        System.out.println(
                "----------------------------------------------------------"
        );

        System.out.printf(
                "Final Summary: Wins: %d | Losses: %d | Draws: %d | Win %%: %.1f%%%n",
                wins,
                losses,
                draws,
                winPercentage
        );
    }
}