
package tictactoe;

/**
 *
 * @author cgonz
 */
import java.util.Random;
public class ComputerPlayer extends Player{    
    private final String name = "Computer Player";

    public ComputerPlayer(Marker marker) {
        super(marker);
    }

    public void pickNumber() {
        int move;
        Random r = new Random(System.nanoTime());
        move = r.nextInt(9) + 1;
        while (getGameBoard().isInvalidInput(move)) {
            move = r.nextInt(9) + 1;
        }
        System.out.println("");
        System.out.println("...........  " + getMarker().getSymbol()
                + " at position " + move);
        System.out.println("");
        super.plotSymbol(move);
    }

    @Override
    public String getName() {
        return name;
    }

}
