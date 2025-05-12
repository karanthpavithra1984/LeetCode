package medium.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Time 4^n/sqrt(n)
 * Space o(n)
 */
public class GenerateParantheses {
    public List<String> generateParenthesis(int n) {
        List<String> resultSet = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        backtracking(resultSet, stringBuilder, 0, 0, n);
        return resultSet;
    }

    public void backtracking(List<String> resultSet, StringBuilder stringBuilder, int openN, int closeN, int N) {
        if (openN == closeN && openN == N) {
            resultSet.add(stringBuilder.toString());
            return;
        }

        if (openN < N) {
            stringBuilder.append("(");
            backtracking(resultSet, stringBuilder, openN + 1, closeN, N);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        if (closeN < openN) {
            stringBuilder.append(")");
            backtracking(resultSet, stringBuilder, openN, closeN + 1, N);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
