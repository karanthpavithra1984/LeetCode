package easy.Stack;

import java.util.Stack;

public class FinalPrices {
    /**
     * Time Complexity o(n)
     * Space Complexity o(1)
     *
     * @param prices
     * @return
     */
    public int[] finalPrices(int[] prices) {
        Stack<Integer> priceHolder = new Stack<>();

        for (int i = prices.length - 1; i >= 0; i--) {
            int temp = prices[i]; //since i am overrding it.
            while (!priceHolder.isEmpty() && (priceHolder.peek() > prices[i])) {
                priceHolder.pop();
            }

            if (!priceHolder.isEmpty()) {
                prices[i] -= priceHolder.peek();
            }

            priceHolder.push(temp);
        }

        return prices;
    }
}
