package chess.game;

import chess.board.Board;
import chess.pieces.Piece;
import util.StringUtil;

public class Game {
    private Board board;


    public Game(){board = new Board();}

    public void start(){
        board.initialize();
    }

    public boolean isValidMovement(String position, Piece.Color color){
        return Board.isValidFile(StringUtil.getFileFromInput(position))
                && Board.isValidRank(StringUtil.getRankFromInput(position)) &&
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
