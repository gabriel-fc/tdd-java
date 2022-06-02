package chess.pieces.types;

import chess.pieces.Piece;

import java.util.ArrayList;

public class King extends Piece {



    public King(Color color){
        super(color, 'k');
    }


    @Override
    public ArrayList<String> getPossibleMoves(String position) {
        ArrayList<String> possibleMoves = new ArrayList();
        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new Forward(), possibleMoves);

        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new Backward(),possibleMoves);

        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new Right(), possibleMoves);

        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new Left(), possibleMoves);

        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new RightForward(), possibleMoves);

        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new LeftForward(), possibleMoves);

        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new RightBackward(), possibleMoves);

        super.movements.moveOneSquareInDirection(position, super.getColor(),
                movements.new LeftBackward(), possibleMoves);

        return possibleMoves;
    }


}
