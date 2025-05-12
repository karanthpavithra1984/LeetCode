package easy.Math;

import java.util.LinkedList;
import java.util.List;

public class AddArrayToForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        //LinkedList addFirst is only o(1) and hence increases the time complexity
        List<Integer> result = new LinkedList<>();

        int lastIndex = num.length - 1;
        int carry = 0;

        //max(num, log(k));
        // If k is 100 , then iterating through each digit is log10 100 + 1
        // log10 100 = 2 , and add 1 , so we loop through thrice
        while (lastIndex >= 0 || k > 0) {
            int n = lastIndex >= 0 ? num[lastIndex] : 0;
            int sum = n;
            if (k > 0) {
                sum += (k % 10);
                k = k / 10;
            }
            if (carry > 0)
                sum += carry;

            carry = sum / 10;

            lastIndex--;

            result.addFirst(sum % 10);
        }

        if (carry > 0) {
            result.addFirst(carry);
        }

        return result;
    }
}
