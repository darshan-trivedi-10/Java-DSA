class Solution {

    public static boolean isValid(char[][] board, int row, int col) {
        int n = board.length, m = board[0].length;
        return row >= 0 && col >= 0 && row < n && col < m;
    }

    public static boolean findWord(char[][] board, String word, int i, int row, int col) {
        if (i == word.length()) {
            return true;
        }

        if (!isValid(board, row, col)) {
            return false;
        }

        if (board[row][col] != word.charAt(i)) {
            return false;
        }

        return findWord(board, word, i + 1, row + 1, col) || findWord(board, word, i + 1, row, col + 1);
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (findWord(board, word, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String word = "SEE";
        char[][] b = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(exist(b, word));
    }
}
