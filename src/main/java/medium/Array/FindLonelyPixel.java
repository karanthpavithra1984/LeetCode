package medium.Array;

public class FindLonelyPixel {
    public int findLonelyPixel(char[][] picture) {
        int rowNum = picture.length;
        int colNum = picture[0].length;

        int[] rows = new int[rowNum];
        int[] cols = new int[colNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if(picture[i][j] == 'B'){
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        int res = 0;

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if(picture[i][j] == 'B' && rows[i] ==1 && cols[j] == 1){
                    res++;
                }
            }
        }

        return res;
    }
}
