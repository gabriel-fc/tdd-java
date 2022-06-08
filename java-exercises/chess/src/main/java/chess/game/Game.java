package chess.game;

import chess.board.Board;
import chess.pieces.Piece;
import util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;


    public Game(){board = new Board();}

    public void start(){
        board.initialize();
        for (Piece[] p: board) {

        }
    }

    public boolean isValidMovement(String position, Piece.Color color){
        return Board.isValidIndex(StringUtil.getFileFromInput(position))
                && Board.isValidIndex(StringUtil.getRankFromInput(position)) &&
        (board.isPositionEmpty(position) ||
                isDifferentColor(color, board.getPiece(position).getColor()));
    }


    public boolean isCapturing(String position, Piece.Color color){
        return !board.isPositionEmpty(position) && board.getPiece(position).getColor() != color;
    }

    public boolean isPositionEmpty(String position){
        return board.isPositionEmpty(position);
    }

    private boolean isDifferentColor(Piece.Color color, Piece.Color color2){
        return color != color2;
    }


}
