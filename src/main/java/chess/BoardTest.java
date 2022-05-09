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
        board.initialize();
    }

    @Test
    public void testBoardRanks(){
        assertEquals("........", board.printRow(8));
        assertEquals("PPPPPPPP", board.printRow(7));
        assertEquals("........", board.printRow(6));
        assertEquals("........", board.printRow(5));
        assertEquals("........", board.printRow(4));
        assertEquals("........", board.printRow(3));
        assertEquals("pppppppp", board.printRow(2));
        assertEquals("........", board.printRow(1));
    }

}
