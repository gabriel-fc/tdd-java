package chess;

import chess.pieces.BoardInterface;
import chess.pieces.Piece;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import util.StringUtil;

public class BoardTest {
    Board board;

    @Before
    public void setUp() {
        board = new Board();
        board.initialize();
    }

    @Test
    public void testBoardRanks() {
        assertEquals("RNBQKBNR", BoardInterface.printRank(0, board.getBoard()));
        assertEquals("PPPPPPPP", BoardInterface.printRank(1, board.getBoard()));
        assertEquals("........", BoardInterface.printRank(2, board.getBoard()));
        assertEquals("........", BoardInterface.printRank(3, board.getBoard()));
        assertEquals("........", BoardInterface.printRank(4, board.getBoard()));
        assertEquals("........", BoardInterface.printRank(5, board.getBoard()));
        assertEquals("pppppppp", BoardInterface.printRank(6, board.getBoard()));
        assertEquals("rnbqkbnr", BoardInterface.printRank(7, board.getBoard()));
    }
    @Test
    public void testCreateBoard() {
        assertEquals(32, board.pieceCount());
        String BLANK_RANK = StringUtil.appendNewLine("........");
        assertEquals(
                StringUtil.appendNewLine("RNBQKBNR") +
                        StringUtil.appendNewLine("PPPPPPPP") +
                        BLANK_RANK + BLANK_RANK + BLANK_RANK + BLANK_RANK +
                        StringUtil.appendNewLine("pppppppp") +
                        StringUtil.appendNewLine("rnbqkbnr"),
                BoardInterface.printBoard(board.getBoard()));
    }
    @Test
    public void testPieceColor() {
        Piece piece1 = Piece.create("p", StringUtil.WHITE_COLOR);
        Piece piece2 = Piece.create("P", StringUtil.BLACK_COLOR);
        assertTrue(piece1.isWhite());
        assertTrue(piece2.isBlack());
    }
}