package medium.Stack;

import java.util.Stack;

/**
 * time complexity o(n)
 * space complexity o(n)
 */

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> astStack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean push = true;

            while (!astStack.isEmpty() && asteroid < 0 && astStack.peek() > 0) {
                if (Math.abs(asteroid) == astStack.peek()) {
                    astStack.pop();
                } else if (Math.abs(asteroid) > astStack.peek()) {
                    astStack.pop();
                    continue;
                }

                push = false;
                break;
            }

            if (push)
                astStack.push(asteroid);
        }

        return astStack.stream().mapToInt(x -> x).toArray();
    }
}
