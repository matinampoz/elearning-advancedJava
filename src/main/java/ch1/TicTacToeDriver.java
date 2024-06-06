package ch1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * checks the correctness of the class TicTacToe
 *
 * @author matinampoz
 */
public class TicTacToeDriver {
    public static void main(String[] args) {
        TicTacToe ticTacToe = TicTacToe.createTicTacToe();
        Scanner in = new Scanner(System.in);

        int i = 1;
        int x, y;
        int times = 1;
        boolean done = false;
        do {
            System.out.println("The player " + i + " is playing");
            System.out.println("Give position (x,y)");
            try {
                if (++times == 10) break;

                x = in.nextInt();
                y = in.nextInt();

                ticTacToe.setValue(x, y, i);

                ticTacToe.printGrid();

                done = ticTacToe.checkForTicTacToe();

                i = (done) ? i : (i % 2 == 0) ? 1 : 2;
                if (done) System.out.println("Tic Tac Toe! Player: "+ i + " wins!!-");


            } catch (InputMismatchException e1) {
                System.out.println("Please give integers");
                in.nextLine(); //an evaza next() kai edine px 4 5 tha evgaze 2 fores lathos
                //i next katanalwnwi to string enw i nextLine tin grammi
            } catch (ValueOutOfBoundsException e2) {
                System.out.println("Please give integers within the limits");
            }

        } while (!done);
    }
}
