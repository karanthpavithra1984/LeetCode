package easy.Stack;

/**
 * Time Complexity - o(n)
 * <p>
 * Space Complexity - o(n)
 */
public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        StringBuilder stringb = new StringBuilder();

        for (Character character : s.toCharArray()) {
            if (!stringb.isEmpty() && stringb.charAt(stringb.length() - 1) == character) {
                stringb.deleteCharAt(stringb.length() - 1);
            } else {
                stringb.append(character);
            }
        }

        return stringb.toString();
    }
}
