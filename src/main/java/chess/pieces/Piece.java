package chess.pieces;

import util.StringUtil;

public class Piece {

    /**
     @value number of pieces on the board
     */
    private static int counter = 0;

    /**
     @value instance color
     */
    private final String color;

    /**
     @value currently refers to the piece type (eg.: b for bishop,p for pawn, n for knight...)
     */
    private final String name;


    private Piece(String name, String color){
        this.name = name;
        this.color = color;
    }

    /**
     * @param name
     * @param color
     * @return piece instance
     */
    public static Piece create(String name, String color){
        Piece.counter++;
        return new Piece(name, color);
    }

    public static void resetCounter(){
        Piece.counter = 0;
    }

    public String getColor() {
        return color;
    }

    public static int getCounter() {
        return Piece.counter;
    }

    public String getName() {
        return name;
    }

    public boolean isBlack(){return color.equals(StringUtil.BLACK_COLOR);}

    public boolean isWhite(){return color.equals(StringUtil.WHITE_COLOR);}
}
