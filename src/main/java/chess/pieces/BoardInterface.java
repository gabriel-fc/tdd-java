package chess.pieces;

import java.util.ArrayList;
import java.util.HashMap;

import static util.StringUtil.NEWLINE;

public class BoardInterface {
    private BoardInterface(){};

    public static String printRank(int id, HashMap<Integer, ArrayList<Piece>> board) {
        StringBuilder buffer = new StringBuilder();
        ArrayList<Piece> rank = board.get(id);
        for (int i = 0; i < 8; i++) {
            if (rank.get(i) == null) {
                buffer.append(".");
            } else {
                buffer.append(rank.get(i).getName());
            }
        }
        return buffer.toString();
    }

    public static String printBoard(HashMap<Integer, ArrayList<Piece>> board) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            buffer.append(printRank(i, board));
            buffer.append(NEWLINE);
        }
        return buffer.toString();
    }
}
