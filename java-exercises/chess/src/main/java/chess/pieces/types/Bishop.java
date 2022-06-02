package chess.pieces.types;

import chess.pieces.Piece;

public class Bishop extends Piece {
    public Bishop(Color color){
        super(color, 'b');
    }

    @Override
    public double getStrength(boolean isAloneInFile) {
        return 3.0;
    }
}
