package fr.timothee.craig.domain.grid;

import fr.timothee.craig.domain.Position;

/**
 * Created by Timothee on 05/06/2016.
 */
public class Grid {
    private int _gridSize;
    private Position[][] _gridPositions;

    public Grid(){
        this(3);
    }

    public Grid(int gridSize) {
        this.initGrid(gridSize);
    }

    private void initGrid(int gridSize){
        this._gridPositions = new Position[gridSize][gridSize];
        for(int i = 0; i < gridSize; i++){
            for(int j = 0; i < gridSize; i++){
                this._gridPositions[i][j] = new Position(i, j);
            }
        }
    }

}
