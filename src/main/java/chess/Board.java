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

    public String printRow(int id){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if(id == 2){
                buffer.append(secondRank.get(i).toString());
            }else if(id == 7){
                buffer.append(seventhRank.get(i).toString());
            }else{
                buffer.append('.');
            }
        }
        return buffer.toString();
    }

    public void printBoard(){
        for (int i = 8; i > 0; i--) {
            System.out.println(printRow(i));
        }
    }

    public void addPiece(Pawn piece){
        piecesOnTheBoard.add(piece);
    }
}
