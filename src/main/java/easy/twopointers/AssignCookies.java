package easy.twopointers;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int contentChildren = 0, cookieIndex = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while (contentChildren < g.length && cookieIndex < s.length) {
            if (g[contentChildren] <= s[cookieIndex]) {
                contentChildren++;
            }

            cookieIndex++;
        }

        return contentChildren;

    }
}
