
package tictactoe;

/**
 *
 * @author cgonz
 */
public abstract class Player {
    private GameBoard gameBoard;
    private Marker marker;

    public Player(Marker marker) {
        this.marker = marker;
    }
    
    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }
    
    public abstract String getName();
    
    public void setSymbolAsX () {
        getMarker().setSymbol("X");
    }
    
    public void setSymbolAsO () {
        getMarker().setSymbol("O");
    }
    
    public void plotSymbol(int cellNumber) {
        switch(cellNumber) {
            case 1:
                getGameBoard().getCells()[0] = new Cell(marker.getSymbol());
                break;
            case 2:
                getGameBoard().getCells()[1] = new Cell(marker.getSymbol());
                break;
            case 3:
                getGameBoard().getCells()[2] = new Cell(marker.getSymbol());
                break;
            case 4:
                getGameBoard().getCells()[3] = new Cell(marker.getSymbol());
                break;
            case 5:
                getGameBoard().getCells()[4] = new Cell(marker.getSymbol());
                break;
            case 6:
                getGameBoard().getCells()[5] = new Cell(marker.getSymbol());
                break;
            case 7:
                getGameBoard().getCells()[6] = new Cell(marker.getSymbol());
                break;
            case 8:
                getGameBoard().getCells()[7] = new Cell(marker.getSymbol());
                break;
            case 9:
                getGameBoard().getCells()[8] = new Cell(marker.getSymbol());
                break;
        }
        
    } 
    
    public boolean isWinner () {
      boolean winnerCheck = false;
        
     if(getGameBoard().getCells()[0].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[1].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[2].getPosition().equals(marker.getSymbol())){
         winnerCheck = true;
     } else if(
        getGameBoard().getCells()[3].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[4].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[5].getPosition().equals(marker.getSymbol())){
        winnerCheck = true;
     } else if(
        getGameBoard().getCells()[6].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[7].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[8].getPosition().equals(marker.getSymbol())){
         winnerCheck = true;
     } else if(
        getGameBoard().getCells()[0].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[3].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[6].getPosition().equals(marker.getSymbol())){
         winnerCheck = true;
     } else if(
        getGameBoard().getCells()[1].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[4].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[7].getPosition().equals(marker.getSymbol())){
         winnerCheck = true;
     } else if(
        getGameBoard().getCells()[2].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[5].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[8].getPosition().equals(marker.getSymbol())){
         winnerCheck = true;
     } else if(
        getGameBoard().getCells()[0].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[4].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[8].getPosition().equals(marker.getSymbol())){
         winnerCheck = true;
     } else if(
        getGameBoard().getCells()[2].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[4].getPosition().equals(marker.getSymbol())
        &&
        getGameBoard().getCells()[6].getPosition().equals(marker.getSymbol())){
         winnerCheck = true;
     }    
         return winnerCheck;
    }
   
}
