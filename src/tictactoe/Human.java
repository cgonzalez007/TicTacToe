
package tictactoe;

/**
 *
 * @author cgonz
 */
public class Human extends Player {
    private String name;

    public Human(Marker marker) {
        super(marker);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
