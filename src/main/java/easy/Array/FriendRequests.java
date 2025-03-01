package easy.Array;

public class FriendRequests {
    public int numFriendRequests(int[] ages) {
        int[] ageGroups = new int[121];
        for(int i = 0; i < ages.length; i++){
            ageGroups[ages[i]]++;
        }

        int result = 0;
        for(int i = 1; i < ageGroups.length; i++){
            int numberOfAgeA = ageGroups[i];
            if(numberOfAgeA <=0 ){
                continue;
            }
            int initialValue = (int) ((i * 0.5) + 7);
            for(int j = initialValue + 1; j <= i ; j++){
                int numberOfAgeB = ageGroups[j];
                if(numberOfAgeB == 0){
                    continue;
                }
                result += numberOfAgeA * numberOfAgeB;
                if(i == j) {
                    result -= numberOfAgeA;
                }
            }
        }

        return result;
    }
}
