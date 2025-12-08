package easy.Array;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int  R = image.length;

        for(int i = 0; i < R; i++){
            int mid = (R+1)/2;
            for(int j = 0; j < mid; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][R - 1 - j] ^ 1;
                image[i][R - 1 - j] = temp ^ 1;
            }
        }

        return image;
    }
}
