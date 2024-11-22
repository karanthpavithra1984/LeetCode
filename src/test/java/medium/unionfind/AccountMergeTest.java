package medium.unionfind;

import org.junit.Test;
import utils.GeneralUtils;

import java.util.Arrays;
import java.util.List;

public class AccountMergeTest {
    AccountsMerge accountsMerge = new AccountsMerge();

    @Test
    public void testAccountMerge() {
        GeneralUtils.compareListOfList(accountsMerge.accountsMerge(List.of(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"), Arrays.asList("Mary", "mary@mail.com"),
                Arrays.asList("John", "johnnybravo@mail.com"))),
                List.of(Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
                Arrays.asList("Mary", "mary@mail.com"),
                Arrays.asList("John", "johnnybravo@mail.com")));
    }
}
