import java.math.BigInteger;
import java.util.Arrays;

class Grains {
    private BigInteger[] chessBoard;

    Grains() {
        chessBoard = new BigInteger[65];
        chessBoard[0] = null;
        chessBoard[1] = BigInteger.valueOf(1);
        for (int i = 2; i < 65; i++) {
            chessBoard[i] = chessBoard[i-1].multiply(BigInteger.valueOf(2));
        }
    }

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");

        return chessBoard[square];


    }

    BigInteger grainsOnBoard() {
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 1; i < 65; i++) {
            sum = sum.add(chessBoard[i]);
        }
        return sum;
    }

}
