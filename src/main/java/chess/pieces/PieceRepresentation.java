package chess.pieces;

public class PieceRepresentation {
    public static final char KING_REPRESENTATION= 'k';
    public static final char QUEEN_REPRESENTATION= 'q';
    public static final char BISHOP_REPRESENTATION= 'b';
    public static final char ROOK_REPRESENTATION= 'r';
    public static final char KNIGHT_REPRESENTATION= 'n';
    public static final char PAWN_REPRESENTATION= 'p';

    public static char getPieceRepresentation(Piece.Color color, Piece.Type type) {
        char rep;
        if (type == Piece.Type.NO_PIECE) return '.';
        if(type == Piece.Type.PAWN) rep = PAWN_REPRESENTATION;
        else if(type == Piece.Type.KING) rep = KING_REPRESENTATION;
        else if(type == Piece.Type.QUEEN) rep = QUEEN_REPRESENTATION;
        else if(type == Piece.Type.ROOK) rep = ROOK_REPRESENTATION;
        else if(type == Piece.Type.BISHOP) rep = BISHOP_REPRESENTATION;
        else rep = KNIGHT_REPRESENTATION;
        if (color == Piece.Color.BLACK) rep = Character.toUpperCase(rep);
        return rep;
    }

    private PieceRepresentation(){}
}
