package medium.Array;

public class MinOperations {
    public int[] minOperations(String boxes) {
        //Calculate left and right
        int movesToRight = 0 , movesToLeft = 0 , boxesToLeft = 0, boxesToRight = 0;
        int[] answer = new int[boxes.length()];
        int n = boxes.length();
        for(int i=0; i < boxes.length(); i++){
            answer[i] += movesToLeft;
            boxesToLeft += Character.getNumericValue(boxes.charAt(i));
            movesToLeft += boxesToLeft ;

            //Right side
            int j = n-i-1;
            answer[j] += movesToRight;
            boxesToRight += Character.getNumericValue(boxes.charAt(j));
            movesToRight += boxesToRight;
        }

        return answer;
    }
}
