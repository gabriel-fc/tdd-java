package chess.pieces;

public class Pawn {
    private final String color;

    public static final String WHITE_COLOR = "white";

    public static final String BLACK_COLOR = "black";
    public Pawn(String color){
        this.color = color;
    }

    public Pawn(){
        this.color = WHITE_COLOR;
    }

    public String getColor() {
        return color;
    }
}
