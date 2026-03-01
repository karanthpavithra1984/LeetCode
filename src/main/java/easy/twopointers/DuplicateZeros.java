package easy.twopointers;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int length = arr.length - 1;
        int possibleDups = 0;

        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                //edge case where the last value is 0, we cant duplicate
                if (i == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length - possibleDups;

        for (int j = last; j >= 0; j--) {
            if (arr[j] == 0) {
                arr[j + possibleDups] = 0;
                possibleDups--;
                arr[j + possibleDups] = 0;
            } else {
                arr[j + possibleDups] = arr[j];
            }
        }
    }
}
