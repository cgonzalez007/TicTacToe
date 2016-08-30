
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author cgonz
 */
// By Chris Gonzalez Ch 7 HW
public class StartGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human player1 = new Human(new Marker());
        player1.setSymbolAsX();
        Human player2 = new Human(new Marker());
        player2.setSymbolAsO();

        GameBoard gameBoard = new GameBoard(player1, player2);
        player1.setGameBoard(gameBoard);
        player2.setGameBoard(gameBoard);

        System.out.println("Player 1, playing with "
                + player1.getMarker().getSymbol() + " symbol, enter your name: ");
        player1.setName(sc.nextLine());
        System.out.println("Player 2, playing with "
                + player2.getMarker().getSymbol() + " symbol, enter your name: ");
        player2.setName(sc.nextLine());
        int input = 0;
        boolean gameIsRunning = true;
        while (gameIsRunning) {
            gameBoard.showBoard();
            System.out.println(player1.getName()
                    + ", make your move! (-1 to quit)");
            input = sc.nextInt();
            if (gameBoard.quitGame(input)) {
                break;
            }
            while (gameBoard.isInvalidInput(input)) {
                System.out.println("Invalid Input! ");
                System.out.println(player1.getName()
                        + ", make your move! (-1 to quit)");
                input = sc.nextInt();
                if (gameBoard.quitGame(input)) {
                    gameIsRunning = false;
                    break;
                }
            }
            if (gameBoard.quitGame(input)) {
                continue;
            }
            player1.plotSymbol(input);
            if (player1.isWinner()) {
                gameBoard.showBoard();
                System.out.println(player1.getName() + " wins!");
                break;
            } else if (gameBoard.gameIsATie()) {
                gameBoard.showBoard();
                System.out.println("The game is a tie!");
                break;
            }
            gameBoard.showBoard();
            System.out.println(player2.getName()
                    + ", make your move! (-1 to quit)");
            input = sc.nextInt();
            if (gameBoard.quitGame(input)) {
                break;
            }
            while (gameBoard.isInvalidInput(input)) {
                System.out.println("Invalid Input! ");
                System.out.println(player2.getName()
                        + ", make your move! (-1 to quit)");
                input = sc.nextInt();
                if (gameBoard.quitGame(input)) {
                    gameIsRunning = false;
                    break;
                }
            }
            if (gameBoard.quitGame(input)) {
                continue;
            }
            player2.plotSymbol(input);
            if (player2.isWinner()) {
                gameBoard.showBoard();
                System.out.println(player2.getName() + " wins!");
                break;
            } else if (gameBoard.gameIsATie()) {
                gameBoard.showBoard();
                System.out.println("The game is a tie!");
                break;
            }
        }
    }
}
