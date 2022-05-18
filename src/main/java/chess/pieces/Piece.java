package chess.pieces;

public class Piece {




    /**
     @value number of pieces on the board
     */
    private static int counter = 0;

    /**
     @value instance Color
     */
    private final Color color;

    /**
     @value currently refers to the piece Type (e.g.: b for bishop,p for pawn, n for knight...)
     */
    private final Type type;
    public enum Color {BLACK, WHITE};
    public enum Type {PAWN(1), QUEEN(9), BISHOP(3), KNIGHT(2.5),
        KING(0), ROOK(5), NO_PIECE(0);
    public final double value;
       private Type(double value) {
           this.value = value;
       }

    };



    private Piece(Type type, Color Color){
        Piece.counter++;
        this.type = type;
        this.color = Color;
    }

    private Piece(Type type){
        this.type = type;
        this.color = null;
    }

    public static void resetCounter(){
        Piece.counter = 0;
    }

    public static int getCounter() {
        return Piece.counter;
    }

    public Type getType() {
        return type;
    }

    public double getValue(){
        return type.value;
    }


    public boolean isBlack(){return color == Color.BLACK;}

    public Color getColor() {
        return color;
    }

    public boolean isWhite(){return color == Color.WHITE;}


    public char getRepresentation(){
        return PieceRepresentation.getPieceRepresentation(color, type);
    }

    public static Piece createWhitePawn(){
        return new Piece(Type.PAWN, Color.WHITE);
    }

    public static Piece createBlackPawn(){
        return new Piece(Type.PAWN, Color.BLACK);
    }

    public static Piece createWhiteQueen(){
        return new Piece(Type.QUEEN, Color.WHITE);
    }

    public static Piece createBlackQueen(){
        return new Piece(Type.QUEEN, Color.BLACK);
    }

    public static Piece createWhiteBishop(){
        return new Piece(Type.BISHOP, Color.WHITE);
    }

    public static Piece createBlackBishop(){
        return new Piece(Type.BISHOP, Color.BLACK);
    }

    public static Piece createWhiteRook(){
        return new Piece(Type.ROOK, Color.WHITE);
    }

    public static Piece createBlackRook(){
        return new Piece(Type.ROOK, Color.BLACK);
    }

    public static Piece createWhiteKing(){
        return new Piece(Type.KING, Color.WHITE);
    }

    public static Piece createBlackKing(){
        return new Piece(Type.KING, Color.BLACK);
    }

    public static Piece createWhiteKnight(){
        return new Piece(Type.KNIGHT, Color.WHITE);
    }

    public static Piece createBlackKnight(){
        return new Piece(Type.KNIGHT, Color.BLACK);
    }

    public static Piece noPiece(){
        return new Piece(Type.NO_PIECE);
    }
}
