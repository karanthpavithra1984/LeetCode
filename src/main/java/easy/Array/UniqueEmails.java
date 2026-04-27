package easy.Array;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> validEmails = new HashSet<>();
        for (String email : emails) {
            String[] emailArr = email.split("@");
            String local = emailArr[0];
            String domain = emailArr[1];

            local = local.replace(".", "");
            local = local.split("\\+")[0];

            validEmails.add(local + "@" + domain);
        }

        return validEmails.size();
    }
}
