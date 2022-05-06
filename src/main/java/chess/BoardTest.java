package chess;

import chess.pieces.Pawn;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {
    Board board;

    @Before
    public void setUp(){
        board = new Board();
    }

    @Test
    public void TestCreate(){
        Pawn pawn1 = new Pawn("white");
        Pawn pawn2 = new Pawn("black");
        assertEquals(0, board.getNumPiecesOnTheBoard());
        board.addPiece(pawn1);
        assertEquals(pawn1, board.getPieceByIndex(0));
        board.addPiece(pawn2);
        assertEquals(pawn2, board.getPieceByIndex(1));
    }
}
