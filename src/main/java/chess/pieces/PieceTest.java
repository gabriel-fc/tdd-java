package chess.pieces;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import util.StringUtil;
public class PieceTest {

    @Test
    public void testCreate(){
        Piece piece1 = Piece.create("pawn", StringUtil.WHITE_COLOR);
        Piece piece2 = Piece.create("pawn", StringUtil.BLACK_COLOR);
        assertEquals("white", piece1.getColor());
        assertEquals("black", piece2.getColor());
        assertEquals("pawn", piece1.getName());
        assertEquals("pawn", piece2.getName());

    }
}
