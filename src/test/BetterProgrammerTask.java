package test;

/**
 * Created by Denis on 10.09.2016.
 */
import java.util.*;


public class BetterProgrammerTask {

    public static List<String> transferFromAtoC(int n) {
        /*
          Towers Of Hanoi.
          There are three pegs: A, B and C. There are n disks. All disks are different in size.
          The disks are initially stacked on peg A so that they increase in size from the top to the bottom.
          The goal is to transfer the entire tower from the A peg to the C peg.
          One disk at a time can be moved from the top of a stack either to an empty peg or to
          a peg with a larger disk than itself on the top of its stack.

          The method should return a sequence of disk moves, each move is a String with two letters (A, B or C)
          corresponding to the peg the disk moves from and the peg it moves to.
          For example, the move "AC" means that a top disk from peg A should be moved to peg C.
         */
        List<String> move = new ArrayList<String>();
        hanoi(n, "A", "B", "C", move);
        return move;
    }

    public static void hanoi(int n, String from, String buffer, String to, List<String> move) {
        if (n >= 1) {
            hanoi(n - 1, from, to, buffer, move);
            move.add(from + to);
            hanoi(n - 1, buffer, from, to, move);
        }

    }
}
