package easy.Array;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollarBills = 0;
        int tenDollarBills = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveDollarBills++;
            } else if (bill == 10) {
                if (fiveDollarBills >= 1) {
                    fiveDollarBills--;
                    tenDollarBills++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (tenDollarBills >= 1 && fiveDollarBills >= 1) {
                    tenDollarBills--;
                    fiveDollarBills--;
                } else if (fiveDollarBills >= 3) {
                    fiveDollarBills -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
