package medium.Array;

public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        //This is tricky, Start from left and find the next dip
        char[] array = new String("" + n).toCharArray();

        int index = array.length - 2;

        while (index >= 0 && array[index] >= array[index + 1]) {
            index--;
        }

        //We have covered all the indexes
        if (index < 0) {
            return -1;
        }

        int index2 = array.length - 1;

        while (index2 > index && array[index2] <= array[index]) {
            index2--;
        }

        swap(array, index, index2);
        reverse(array, index + 1);

        try {
            return Integer.parseInt(String.valueOf(array));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void reverse(char[] array, int start) {
        int end = array.length - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
