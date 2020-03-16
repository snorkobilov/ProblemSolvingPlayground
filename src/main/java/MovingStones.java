import javax.swing.tree.TreeNode;
import java.util.Arrays;

public class MovingStones {

    /*
    Three stones are on a number line at positions a, b, and c.

Each turn, you pick up a stone at an endpoint (ie., either the lowest or highest position stone), and move it to an
unoccupied position between those endpoints.  Formally, let's say the stones are currently at positions x, y, z with
x < y < z.  You pick up the stone at either position x or position z, and move that stone to an integer position k,
with x < k < z and k != y.

The game ends when you cannot make any more moves, ie. the stones are in consecutive positions.

When the game ends, what is the minimum and maximum number of moves that you could have made?  Return the answer as
an length 2 array: answer = [minimum_moves, maximum_moves]
     */

    public static int[] numMovesStones(int a, int b, int c) {
        int[] stones = new int[]{a, b, c};
        stones = Arrays.stream(stones).sorted().toArray();

        return new int[]{minMoves(stones), maxMoves(stones)};
    }

    private static int minMoves(int[] stones) {
        if (stones[1] - stones[0] == 1 && stones[2] - stones[1] == 1) {
            return 0;
        }

        if (stones[1] - stones[0] <= 2 || stones[2] - stones[1] <= 2) {
            return 1;
        }
        return 2;
    }
    private static int maxMoves(int[] stones) {
        return stones[2] - stones[0] - 2;
    }
}
