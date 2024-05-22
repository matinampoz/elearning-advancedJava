package org.example.ch1;

/**
*Clas tic-tac-toe
 * provides methods for the game
 *
 * @author matinampoz
 * @see TicTacToe
 * @see #createTicTacToe()
 * @see #printGrid()
 * @see #setValue(int, int, int)
 * @see #checkForTicTacToe()
 *
*/
public class TicTacToe {
    private int[][] grid = new int[3][3];

    public TicTacToe() {}

    /**
    *Static Factory method
    *@return an object tic tac toe
     */
    public static TicTacToe createTicTacToe(){
        return new TicTacToe();
    }

    public void printGrid(){
        for (int[] row : grid){
            for (int elem : row){
                System.out.print(elem);
            }
            System.out.println();
        }
    }

    /**
     * Sets value 1 or 2 in position (x,y)
     * @param x position x
     * @param y position y
     * @param value 1 or 2, the value given by the player
     */

    public void setValue(int x, int y, int value) throws ValueOutOfBoundsException{
        if (x<0 || x>2 || y<1 || y>2 || value!=1 ||value !=2){
            throw new ValueOutOfBoundsException();
        }
        grid[x][y] = value;
    }

    /**
     * checks for tic tac toe
     * only diagonals
     * @return true if we have tic tac toe, else false
     */

    public boolean checkForTicTacToe(){
        return ((grid[0][0] == grid[1][1]) && (grid[1][1] == grid[2][2]) |
                (grid[0][2] == grid[1][1] ) && (grid[1][1] == grid[2][0]) &&
                (grid[1][1] != 0));
    }
}
