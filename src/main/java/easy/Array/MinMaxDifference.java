package easy.Array;

public class MinMaxDifference {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        int maxNum = num;
        int minNum = num;
        for(int i=0; i < numStr.length(); i++) {
           if(numStr.charAt(i) != '9'){
               maxNum =Math.max(maxNum, Integer.parseInt(numStr.replace(numStr.charAt(i), '9')));
           }
           if(numStr.charAt(i) != '0'){
               minNum = Math.min(minNum, Integer.parseInt(numStr.replace(numStr.charAt(i), '0')));
           }
        }

        return maxNum - minNum;
    }
}
