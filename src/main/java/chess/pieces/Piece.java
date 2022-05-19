package chess.pieces;
import chess.pieces.types.Type;

public class Piece {

    private static int counter = 0;
    private final Color color;
    private final Type type;
    public enum Color {BLACK, WHITE}
//    public enum Type {
//        PAWN(1, 'p'), QUEEN(9, 'q'), BISHOP(3, 'b'),
//        KNIGHT(2.5, 'n'), KING(0, 'k'), ROOK(5, 'r'),
//        NO_PIECE(0, '.');
//
//
//    private final double value;
//    private final char representation;
//
//
//       private Type(double value, char representation) {
//           this.value = value;
//           this.representation = representation;
//       }
//
//        public char getRepresentation(Color color) {
//            return color == Color.BLACK ? Character.toUpperCase(representation) : representation;
//        }
//
//
//    };



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

    public double getStrength(boolean isAloneInFile){
        return type.getStrength(isAloneInFile);
    }


    public boolean isBlack(){return color == Color.BLACK;}

    public Color getColor() {
        return color;
    }

    public boolean isWhite(){return color == Color.WHITE;}


    public char getRepresentation(){
        return type.getRepresentation(color);
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
