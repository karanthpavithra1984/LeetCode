package medium.unionfind;

import utils.UnionFind;
import utils.UnionFindForCharacters;

public class SmallestEquivalentString {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFindForCharacters unionFind = new UnionFindForCharacters(26);

        for(int i=0 ; i < s1.length(); i++){
            int char1 = s1.charAt(i) - 'a';
            int char2 = s2.charAt(i) - 'a';

            //Union them
            unionFind.union(char1, char2);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int j=0; j < baseStr.length(); j++){
            char ch = (char)(unionFind.findParent(baseStr.charAt(j) - 'a') + 'a');
            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }
}
