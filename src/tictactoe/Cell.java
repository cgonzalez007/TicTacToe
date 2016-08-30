
package tictactoe;

/**
 *
 * @author cgonz
 */
public class Cell {
    private String position;

    public Cell(String position) {
        this.position = position;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return getPosition();
    }
    
    
}
