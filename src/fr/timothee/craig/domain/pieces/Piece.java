package fr.timothee.craig.domain.pieces;


import fr.timothee.craig.domain.Position;

/**
 * Created by Timothee on 05/06/2016.
 */
public class Piece {
    private Position position; //x, y
    private PieceType pieceType; // Cross or nought

    public Piece(){
        this.initPosition();
    }

    private void initPosition(){
        this.position = new Position();
    }

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(int x, int y) {
        this.position = new Position(x, y);
    }



}
