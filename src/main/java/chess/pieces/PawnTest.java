package chess.pieces;

import chess.pieces.Pawn;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PawnTest {

    @Test
    public void testCreate(){
        Pawn pawn1 = new Pawn("white");
        Pawn pawn2 = new Pawn("black");
        assertEquals(Pawn.WHITE_COLOR, pawn1.getColor());
        assertEquals(Pawn.BLACK_COLOR, pawn2.getColor());
    }

    @Test
    public void testDefaultColor(){
        Pawn pawn1 = new Pawn();
        assertEquals("white", pawn1.getColor());
    }

}
