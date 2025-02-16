package easy.Matrix;

public class FloodFill {
    private static int ROWS;
    private static int COLS;
    private static int ORIGINALCOLOR;
    private static int COLOR;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        ROWS = image.length;
        COLS = image[0].length;
        ORIGINALCOLOR = originalColor;
        COLOR = color;
        if (originalColor != color) {
            dfs(image, sr, sc);
        }

        return image;
    }

    private void dfs(int[][] image, int rowNumber, int columnNumber) {
        if (rowNumber < 0 || columnNumber < 0 || rowNumber >= ROWS || columnNumber >= COLS ||
                image[rowNumber][columnNumber] != ORIGINALCOLOR) {
            return;
        }

        image[rowNumber][columnNumber] = COLOR;

        dfs(image, rowNumber + 1, columnNumber);
        dfs(image, rowNumber -1, columnNumber);
        dfs(image, rowNumber, columnNumber-1);
        dfs(image, rowNumber, columnNumber+1);
    }
}
