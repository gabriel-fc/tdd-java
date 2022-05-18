package chess.pieces;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import util.StringUtil;
import static org.junit.Assert.assertTrue;
public class PieceTest {

    @Test
    public void testCreate() {
        verifyCreation(
                Piece.createWhitePawn(), Piece.createBlackPawn(),
                Piece.Type.PAWN, PieceRepresentation.PAWN_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteRook(), Piece.createBlackRook(),
                Piece.Type.ROOK, PieceRepresentation.ROOK_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteKnight(), Piece.createBlackKnight(),
                Piece.Type.KNIGHT, PieceRepresentation.KNIGHT_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteBishop(), Piece.createBlackBishop(),
                Piece.Type.BISHOP, PieceRepresentation.BISHOP_REPRESENTATION);
        verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(),
                Piece.Type.QUEEN, PieceRepresentation.QUEEN_REPRESENTATION);
        verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(),
                Piece.Type.KING, PieceRepresentation.KING_REPRESENTATION);
        Piece blank = Piece.noPiece();
        assertEquals('.'
                , blank.getRepresentation());
        assertEquals(Piece.Type.NO_PIECE, blank.getType());
    }
    private void verifyCreation(Piece whitePiece, Piece blackPiece,
                                Piece.Type type, char representation) {
        assertTrue(whitePiece.isWhite());
        assertEquals(type, whitePiece.getType());
        assertEquals(representation, whitePiece.getRepresentation());
        assertTrue(blackPiece.isBlack());
        assertEquals(type, blackPiece.getType());
        assertEquals(Character.toUpperCase(representation),
                blackPiece.getRepresentation());
    }
}

