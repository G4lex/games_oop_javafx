package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (vert(board, i) || horizont(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean horizont(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean vert(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
