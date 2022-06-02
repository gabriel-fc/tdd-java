package chess.pieces.types;

import chess.pieces.Piece;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeTest {
    private final double DELTA = 0.05;


    @Test
    public void typeTest(){
        assertEquals(3, new Bishop(Piece.Color.WHITE).getStrength(true), DELTA);
        assertEquals(9, new Queen(Piece.Color.WHITE).getStrength(true), DELTA);
        assertEquals(0, new King(Piece.Color.WHITE).getStrength(true), DELTA);
        assertEquals(5, new Rook(Piece.Color.WHITE).getStrength(true), DELTA);
        assertEquals(2.5, new Knight(Piece.Color.WHITE).getStrength(true), DELTA);
        assertEquals(1.0, new Pawn(Piece.Color.WHITE).getStrength(true), DELTA);
        assertEquals(0.5, new Pawn(Piece.Color.WHITE).getStrength(false), DELTA);
    }

    @Test
    public void getKingPossibleMovesTest(){
        King king = new King(Piece.Color.WHITE);
        assertEquals("[b5, b3, c4, a4, c5, a5, c3, a3]",
                king.getPossibleMoves("b4").toString());

        assertEquals("[b2, c1, a1, c2, a2]",
                king.getPossibleMoves("b1").toString());

    }

    @Test
    public void getQueenPossibleMovesTest(){
        assertEquals("[d4, d5, d6, d7, d8, d2, d1, e3, f3, g3, " +
                        "h3, c3, b3, a3, e4, f5, g6, h7, c4, b5, a6, e2, f1, c2, b1]",
                (new Queen(Piece.Color.WHITE)).
                        getPossibleMoves("d3").toString());
        assertEquals("[a4, a5, a6, a7, a8, a2, a1, b3, c3, d3, " +
                        "e3, f3, g3, h3, b4, c5, d6, e7, f8, b2, c1]",
                (new Queen(Piece.Color.WHITE)).
                        getPossibleMoves("a3").toString());
    }

    @Test
    public void getBishopPossibleMovesTest(){}

}
