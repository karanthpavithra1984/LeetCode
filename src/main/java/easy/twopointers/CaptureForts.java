package easy.twopointers;

public class CaptureForts {
    /**
     * Time Complexity o(n)
     * @param forts
     * @return
     */

    //So basically , we need to find the captures between -1 and 1.
    public int captureForts(int[] forts) {
       int left = 0, right = 0 ;
       int maxCapture = 0;

       while(right < forts.length) {
           if(forts[right] == 1 || forts[right] == -1) {
               //Check if the left is 1  and right is -1 or vice versa
               if((forts[left] == -1 && forts[right] == 1) || (forts[left] == 1 && forts[right] == -1)) {
                   maxCapture = Math.max(maxCapture, right-left-1);
               }

               left = right;
           }

           right++;
       }

       return maxCapture;
    }
}
