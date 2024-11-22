package medium.unionfind;

import java.util.*;

/**
 * Time complexity NKlogNK + NK -> NKlogNK
 * Space Complexity NK
 */

public class AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        UnionFind unionFind = new UnionFind(accounts.size());
        Map<String, Integer> emailGroups = new HashMap<>();

        //Uniom and find first -
        // N number of accounts , K is the size of each account
        // N*K(a(N)) -> NK
        for (int j = 0; j < accounts.size(); j++) {
            List<String> account = accounts.get(j);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                if (!emailGroups.containsKey(email)) {
                    emailGroups.put(email, j);
                } else {
                    unionFind.union(j, emailGroups.get(email));
                }
            }
        }

        //List of emails - Will be anyways less than N*K

        Map<Integer, List<String>> components = new HashMap<>();
        for (String email : emailGroups.keySet()) {
            //Find parent to make sure the parent is added
            int group = unionFind.findParent(emailGroups.get(email));
            if (!components.containsKey(group)) {
                components.put(group, new ArrayList<>());
            }
            components.get(group).add(email);

        }

        //Now create the list.
        //Sorting is NKlogNK
        List<List<String>> mergedAccounts = new ArrayList<>();
        for (int component : components.keySet()) {
            String name = accounts.get(component).get(0); // firt in the array is name

            Collections.sort(components.get(component));

            List<String> mergedAccount = new ArrayList<>();
            mergedAccount.add(name);
            mergedAccount.addAll(components.get(component));
            mergedAccounts.add(mergedAccount);
        }


        return mergedAccounts;
    }
}
