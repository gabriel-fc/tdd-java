package chess;

import chess.pieces.Piece;
import static util.StringUtil.*;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Board {

    private HashMap<Integer, ArrayList<Piece>> board;
    //private final char[] keys = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    public Board() {
        board = new HashMap<>();
    }

    /**
     * resets counter, clean the board and sets board as the initial chess config
     */
    public void initialize() {
        Piece.resetCounter();
        board.clear();
        //line A: black pieces
        board.put(0, new ArrayList<>(Arrays.asList(Piece.create("R", BLACK_COLOR),
                Piece.create("N", BLACK_COLOR), Piece.create("B", BLACK_COLOR),
                Piece.create("Q", BLACK_COLOR), Piece.create("K", BLACK_COLOR),
                Piece.create("B", BLACK_COLOR), Piece.create("N", BLACK_COLOR),
                Piece.create("R", BLACK_COLOR))));

        //line B: black pawns
        board.put(1, new ArrayList<>(Arrays.asList(Piece.create("P", BLACK_COLOR),
                Piece.create("P", BLACK_COLOR), Piece.create("P", BLACK_COLOR),
                Piece.create("P", BLACK_COLOR), Piece.create("P", BLACK_COLOR),
                Piece.create("P", BLACK_COLOR), Piece.create("P", BLACK_COLOR),
                Piece.create("P", BLACK_COLOR))));

        //empty lines
        board.put(2, new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null)));
        board.put(3, new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null)));
        board.put(4, new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null)));
        board.put(5, new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null)));

        //line G: white pawns
        board.put(6, new ArrayList<>(Arrays.asList(Piece.create("p", WHITE_COLOR),
                Piece.create("p", WHITE_COLOR), Piece.create("p", WHITE_COLOR),
                Piece.create("p", WHITE_COLOR), Piece.create("p", WHITE_COLOR),
                Piece.create("p", WHITE_COLOR), Piece.create("p", WHITE_COLOR),
                Piece.create("p", WHITE_COLOR))));

        //line H: white pieces
        board.put(7, new ArrayList<>(Arrays.asList(Piece.create("r", WHITE_COLOR),
                Piece.create("n", WHITE_COLOR), Piece.create("b", WHITE_COLOR),
                Piece.create("q", WHITE_COLOR), Piece.create("k", WHITE_COLOR),
                Piece.create("b", WHITE_COLOR), Piece.create("n", WHITE_COLOR),
                Piece.create("r", WHITE_COLOR))));
    }

    public int pieceCount() {
        return Piece.getCounter();
    }
    public HashMap<Integer, ArrayList<Piece>> getBoard() {
        return board;
    }
}

