package medium.Array;

public class StringWithout3A3B {
    public String strWithout3a3b(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();

        while (a > 0 || b > 0) {
            if (stringBuilder.toString().endsWith("aa")) {
                stringBuilder.append("b");
                b--;
            } else if (stringBuilder.toString().endsWith("bb")) {
                stringBuilder.append("a");
                a--;
            } else if (a > b) {
                stringBuilder.append("a");
                a--;
            } else {
                stringBuilder.append("b");
                b--;
            }
        }
        return stringBuilder.toString();
    }

}
