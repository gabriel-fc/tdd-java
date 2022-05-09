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
    public void testRanks(){
        assertEquals("pppppppp", board.printRow("second rank"));
        assertEquals("PPPPPPPP", board.printRow("seventh rank"));
    }

}
