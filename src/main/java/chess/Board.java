package chess;

import chess.pieces.Pawn;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    private ArrayList<Pawn> piecesOnTheBoard;
    private  ArrayList<Pawn> secondRank;
    private  ArrayList<Pawn> seventhRank;


    public Board(){
        this.piecesOnTheBoard = new ArrayList<>();
    }


    public void initialize(){
        secondRank = new ArrayList<>();
        seventhRank = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            secondRank.add(new Pawn());
            seventhRank.add(new Pawn(Pawn.BLACK_COLOR));
        }

    }
    public Pawn getPieceByIndex(int index) {
        return piecesOnTheBoard.get(index);
    }

    public int getNumPiecesOnTheBoard() {
        return piecesOnTheBoard.size();

    }

    public String printRow(String id){
        StringBuilder buffer = new StringBuilder();
        ArrayList<Pawn> row = id.equals("second rank") ? secondRank : seventhRank;
        for (Pawn pawn: row) {
            buffer.append(pawn.toString());
        }
        return buffer.toString();
    }

    public void addPiece(Pawn piece){
        piecesOnTheBoard.add(piece);
    }
}
