package medium.Stack;

import java.util.Stack;

/**
 * time complexity o(n)
 * space complexity o(n)
 */

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asterioids = new Stack<>();

        for(int asteroid: asteroids){
            boolean push = true;
            while(!asterioids.isEmpty() && asterioids.peek() > 0 && asteroid < 0) {
                if(Math.abs(asteroid) > Math.abs(asterioids.peek())){
                    asterioids.pop();
                    continue;
                }else if(Math.abs(asteroid) == Math.abs(asterioids.peek())){
                    asterioids.pop();
                }
                push = false;
                break;
            }

            if(push)
                asterioids.push(asteroid);
        }

        return asterioids.stream().mapToInt(x -> x).toArray();
    }
}
