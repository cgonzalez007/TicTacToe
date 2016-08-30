
package tictactoe;

/**
 *
 * @author cgonz
 */
public class GameBoard {
        private Cell[] cells = {
        new Cell("1"),new Cell("2"),new Cell("3"),
        new Cell("4"),new Cell("5"),new Cell("6"),
        new Cell("7"),new Cell("8"),new Cell("9")
    };

        private Player player1, player2;
        
    public GameBoard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void showBoard(){
        System.out.println("|" + getCells()[0] + "|"
                + getCells()[1] + "|" + getCells()[2] + "|");
        System.out.println("------");
        System.out.println("|" + getCells()[3] + "|"
                + getCells()[4] + "|" + getCells()[5] + "|");
        System.out.println("------");
        System.out.println("|" + getCells()[6] + "|"
                + getCells()[7] + "|" + getCells()[8] + "|");
        System.out.println("");
    }

    public Cell[] getCells() {
        return cells;
    }

    public void setCells(Cell[] cells) {
        this.cells = cells;
    }
    
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
    
    public boolean isInvalidInput (int input){
        boolean inputIsInvalid = false;
        if (input < 1 || input > 9) {
            inputIsInvalid = true;
        } else if (getCells()[input - 1].getPosition().equals
        (player1.getMarker().getSymbol())
                || getCells()[input - 1].getPosition().equals
        (player2.getMarker().getSymbol())) {
            inputIsInvalid = true;
        }
        return inputIsInvalid;
    }
    
    public boolean gameIsATie() {
        boolean tieIndicator = false;
        if ((getCells()[0].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[0].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[1].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[1].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[2].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[2].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[3].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[3].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[4].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[4].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[5].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[5].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[6].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[6].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[7].getPosition().equals(player1.getMarker().getSymbol())
         || getCells()[7].getPosition().equals(player2.getMarker().getSymbol()))
         && (getCells()[8].getPosition().equals(player1.getMarker().getSymbol())
       || getCells()[8].getPosition().equals(player2.getMarker().getSymbol()))){
            tieIndicator = true;
        }
            return tieIndicator;
    }
    public boolean quitGame(int input){
        boolean wantsToQuit = false;
        if (input == -1){
            wantsToQuit = true;
        }
        return wantsToQuit;
    }
}
