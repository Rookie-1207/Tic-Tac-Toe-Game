import java.util.Random;

public class TicTacToe {

    static boolean isPlayer1Turn;
    static char player1Symbol;
    static char player2Symbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            isPlayer1Turn = true;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            isPlayer1Turn = false;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }
    }


    static void displayTossResult() {
        System.out.println("=== Toss Result ===");

        if (isPlayer1Turn) {
            System.out.println("Player 1 starts first!");
        } else {
            System.out.println("Player 2 starts first!");
        }

        System.out.println("Player 1 symbol: " + player1Symbol);
        System.out.println("Player 2 symbol: " + player2Symbol);
    }
}