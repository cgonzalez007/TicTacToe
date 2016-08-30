
package tictactoe;

/**
 *
 * @author cgonz
 */
public class Marker {
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAsX() {
        setSymbol("X");
    }

    public void setAsO() {
        setSymbol("O");
    }

    @Override
    public String toString() {
        return getSymbol();
    }
    
}
