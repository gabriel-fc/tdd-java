package chess;

import chess.pieces.Pawn;

import java.util.ArrayList;

public class Board {
    private ArrayList<Pawn> piecesOnTheBoard;


    public Board(){
        this.piecesOnTheBoard = new ArrayList<>();
    }

    public Pawn getPieceByIndex(int index) {
        return piecesOnTheBoard.get(index);
    }

    public int getNumPiecesOnTheBoard() {
        return piecesOnTheBoard.size();

    }

    public void addPiece(Pawn piece){
        piecesOnTheBoard.add(piece);
    }
}
