package fr.timothee.craig.domain;

/**
 * Created by Timothee on 05/06/2016.
 */
public class Position {
    private int x;
    private int y;

    public Position(){
        this(0,0);
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY() { return this.y; }

}
