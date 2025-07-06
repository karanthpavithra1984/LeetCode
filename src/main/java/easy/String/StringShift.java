package easy.String;

/**
 * Time Complexity o(n)
 * Space Complexity o(n)
 */

public class StringShift {
    public String stringShift(String s, int[][] shift) {
        int numberofShifts = 0;
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0) {
                numberofShifts -= shift[i][1];
            } else {
                numberofShifts += shift[i][1];
            }
        }

        numberofShifts = numberofShifts % s.length();


        if (numberofShifts == 0) {
            return s;
        }
        if (numberofShifts > 0) {
            int numOfShifts = s.length() - numberofShifts;
            return s.substring(numOfShifts) + s.substring(0, numOfShifts);
        }

        return
                s.substring(Math.abs(numberofShifts)) + s.substring(0, Math.abs(numberofShifts));

    }
}
