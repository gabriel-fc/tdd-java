package chess.board;

import chess.pieces.Piece;
import chess.pieces.types.NoPiece;
import chess.pieces.types.Queen;
import util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Board implements Iterable<Piece[]> {

    private Piece[][] board;
    private int piecesCount;

    public Board(){
        board = new Piece[8][8];
        piecesCount = 0;
    }

    public static boolean isValidIndex(int file){
        return file >= 0 && file < 8;
    }


    public static boolean isValidPosition(String position){
        return isValidIndex(StringUtil.getRankFromInput(position)) &&
        isValidIndex(StringUtil.getFileFromInput(position));
    }


    public void setEmptyRank(int rank){
        for (int file = 0; file < 8; file++) {
            placePiece(Piece.noPiece(), StringUtil.setPosition(file, rank));
        }
    }
    public void setEmptyBoard(){
        for (int rank = 0; rank < 8; rank++) {
            setEmptyRank(rank);
        }
    }


    public void initialize() {

        //Rank 1: white pieces
        placePiece(Piece.createWhiteRook(), "a1");
        placePiece(Piece.createWhiteKnight(), "b1");
        placePiece(Piece.createWhiteBishop(), "c1");
        placePiece(Piece.createWhiteQueen(), "d1");
        placePiece(Piece.createWhiteKing(), "e1");
        placePiece(Piece.createWhiteBishop(), "f1");
        placePiece(Piece.createWhiteKnight(), "g1");
        placePiece(Piece.createWhiteRook(), "h1");

        //rank 2: white pawns
        placePiece(Piece.createWhitePawn(), "a2");
        placePiece(Piece.createWhitePawn(), "b2");
        placePiece(Piece.createWhitePawn(), "c2");
        placePiece(Piece.createWhitePawn(), "d2");
        placePiece(Piece.createWhitePawn(), "e2");
        placePiece(Piece.createWhitePawn(), "f2");
        placePiece(Piece.createWhitePawn(), "g2");
        placePiece(Piece.createWhitePawn(), "h2");


        //fill the next 4 ranks with blank space
        for (int rank = 2; rank < 6; rank++) {
            for (int file = 0; file < 8; file++) {
                board[rank][file] = new NoPiece();
            }
        }

        //rank 7: black pawns
        placePiece(Piece.createBlackPawn(), "a7");
        placePiece(Piece.createBlackPawn(), "b7");
        placePiece(Piece.createBlackPawn(), "c7");
        placePiece(Piece.createBlackPawn(), "d7");
        placePiece(Piece.createBlackPawn(), "e7");
        placePiece(Piece.createBlackPawn(), "f7");
        placePiece(Piece.createBlackPawn(), "g7");
        placePiece(Piece.createBlackPawn(), "h7");

        //rank 8: black pieces
        placePiece(Piece.createBlackRook(), "a8");
        placePiece(Piece.createBlackKnight(), "b8");
        placePiece(Piece.createBlackBishop(), "c8");
        placePiece(Piece.createBlackQueen(), "d8");
        placePiece(Piece.createBlackKing(), "e8");
        placePiece(Piece.createBlackBishop(), "f8");
        placePiece(Piece.createBlackKnight(), "g8");
        placePiece(Piece.createBlackRook(), "h8");
    }
    public Piece getPiece(String position){
        int rank = StringUtil.getRankFromInput(position);
        int file = StringUtil.getFileFromInput(position);
        try{
            return board[rank][file];

        }catch (IndexOutOfBoundsException e) {
            String wrongPosition = file + Integer.toString(rank);
            System.out.println("Error! trying to access non-existing position (" + wrongPosition + ") " +
                    "inside getPiece method");
            System.out.println(e.getMessage());
            System.exit(-1);
            return null;
        }
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public boolean isAloneInTheFile(char rep, int file){
        int count = 0;
        for (int i = 7; i >= 0; i--) {
            Piece piece = getPiece(StringUtil.setPosition(file, i));
            if (piece.getRepresentation() == rep) {
                count++;
                if(count > 1) return false;
            }
        }
        return true;
    }

    public double getStrengthByFile(Piece.Color color, int file){
        double strength = 0;
        for (int i = 0; i < 8; i++) {
            Piece piece = board[i][file];
            if (color == piece.getColor())
                strength += piece.getStrength(isAloneInTheFile(piece.getRepresentation(), file));
        }
        return strength;
    }

    public double getStrength(Piece.Color color){
        double strength = 0;
        for (int file = 0; file < 8; file++) {
            strength += getStrengthByFile(color, file);
        }
        return  strength;
    }

    public void placePiece(Piece piece, String position){
        int rank = StringUtil.getRankFromInput(position);
        int file = StringUtil.getFileFromInput(position);
        board[rank][file] = piece;
        piece.setPosition(position);
        incrementCount();

    }
    private void incrementCount(){piecesCount++;}
    public boolean isPositionEmpty(String position){
        return getPiece(position).getClass() == NoPiece.class;
    }
    @Override
    public Iterator<Piece[]> iterator() {return Arrays.asList(board).iterator();}}

