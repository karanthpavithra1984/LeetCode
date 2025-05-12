package medium.twopointers;

public class ContainsMostWater {
    public int maxArea(int[] height) {
        int leftIndex = 0, rightIndex = height.length - 1;
        int currentArea = 0, maxArea = 0;

        while (leftIndex < rightIndex) {
            int width = rightIndex - leftIndex;
            currentArea = Math.min(height[leftIndex], height[rightIndex]) * width;
            maxArea = Math.max(currentArea, maxArea);

            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }
}
