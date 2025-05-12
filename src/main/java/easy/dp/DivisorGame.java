package easy.dp;

public class DivisorGame {
    public boolean divisorGame(int n) {
        if (n == 1) return false;
        boolean two = true;

        for (int i = 3; i <= n; i++) {
            two = !two;
        }

        return two;
    }
}
