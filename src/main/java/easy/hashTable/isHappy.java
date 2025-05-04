package easy.hashTable;

import java.util.HashSet;
import java.util.Set;

public class isHappy {
    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<>();
        while (n != 1 && !hashSet.contains(n)){
            hashSet.add(n);
            n= getNext(n);
        }

        return n==1;
    }

    private int getNext(int n){
        int sum = 0 ;

        while(n > 0){
            int rem = n % 10;
            n = n/10;
            sum+= rem*rem;
        }

        return sum;
    }
}
