package easy.Array;

public class MinOperations {
    public int minOperations(String s) {
         int startZero = 0;

         for(int i=0 ; i < s.length(); i++){
             //even index, starts with 0 and is 0, so check for one , to count flips
             if(i%2 == 0){
                 if(s.charAt(i) == '1'){
                     startZero++;
                 }
             }else{
                 //Odd Index, this should be 1 , so check for 0 , to count flips
                 if(s.charAt(i) == '0'){
                     startZero++;
                 }
             }
         }

         //There are two ways , starts with 0 and starts with 1, hence this
         return Math.min(startZero, s.length() - startZero);
    }
}
