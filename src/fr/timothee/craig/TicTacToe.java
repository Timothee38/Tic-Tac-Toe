package fr.timothee.craig;

import fr.timothee.craig.domain.grid.Grid;
import fr.timothee.craig.gui.Window;

/**
 * Created by Timothee on 20/06/2016.
 */
public class TicTacToe {

    private static TicTacToe currentInstance;

    //Initialize game components
    private Grid grid;
    private Window window;

    public TicTacToe() {
        currentInstance = this;
        this.grid = new Grid(); //3x3 for now
        this.window = new Window();
    }

    public static TicTacToe getCurrentInstance() {
        return currentInstance;
    }

    public Grid getGrid(){
        return grid;
    }

    public Window getWindow() {
        return window;
    }

    public static void main(String[] arguments){
        new TicTacToe();


    }


}
