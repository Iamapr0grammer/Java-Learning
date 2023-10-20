import java.util.Scanner;

public class TocTacToe {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char currentPlayer = 'X';

        Scanner input = new Scanner(System.in);
        boolean gameWon = false;

        while (true) {
            displayBoard(board);

            int row, col;
            do {
                System.out.print("Gracz " + currentPlayer + ", podaj wiersz (0-2) i kolumnę (0-2) oddzielone spacją: ");
                row = input.nextInt();
                col = input.nextInt();
            } while (!isValidMove(board, row, col));

            board[row][col] = currentPlayer;

            gameWon = checkWin(board, currentPlayer);

            if (gameWon) {
                displayBoard(board);
                System.out.println("Gracz " + currentPlayer + " wygrywa!");
                break;
            }

            if (isBoardFull(board)) {
                displayBoard(board);
                System.out.println("Remis!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        input.close();
    }

    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            System.out.println("Nieprawidłowy ruch. Spróbuj ponownie.");
            return false;
        }
        return true;
    }

    public static boolean checkWin(char[][] board, char player) {
        // Sprawdzenie poziomych i pionowych linii
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Sprawdzenie przekątnych linii
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
