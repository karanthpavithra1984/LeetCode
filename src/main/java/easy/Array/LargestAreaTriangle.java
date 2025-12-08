package easy.Array;

public class LargestAreaTriangle {
    public double largestTriangleArea(int[][] points) {
        int base = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        for(int[] point:points){
            base = Math.max(base,point[0]);
            height = Math.max(height,point[1]);
        }

        return (double) (base * height) /2;
    }
}
