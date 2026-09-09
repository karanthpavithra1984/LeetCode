package medium.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        String sequentialString = "123456789";
        int SEQ_STR_LEN = sequentialString.length();

        List<Integer> sequentialDigits = new ArrayList<>();

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for(int len = lowLen; len <= highLen; len++){
            for(int index = 0; index <= SEQ_STR_LEN - len; index++){
                String sequential = sequentialString.substring(index, index+len);

                int number = Integer.parseInt(sequential);

                if(number >= low && number <= high){
                    sequentialDigits.add(number);
                }
            }
        }



        return sequentialDigits;
    }
}
