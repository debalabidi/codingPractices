package com.practice.leetcode.visa;

import java.util.Stack;

/**
 * Created by dabidi on 8/6/19.
 */
public class AsteroidCollision {
    public static void main(String[] args) {

    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        //{5, 10, -5}
        //{
        for (int i = 0 ; i < asteroids.length; i++) {
            int incoming = asteroids[i];
            if(stack.isEmpty()){
                stack.push(incoming);
            }else{
                while (!stack.isEmpty()  ) {
                    if(stack.peek() > 0 && incoming < 0){
                        int old = stack.peek();
                        if(Math.abs(incoming) >  old){
                            stack.pop();
                            continue;

                        }else if (Math.abs(incoming) == old){
                            stack.pop();
                            break;
                        }else{
                            break;
                        }
                    }else if(stack.peek() <0 && incoming < 0){
                        stack.push(incoming);
                        break;
                    }else if (stack.peek() >0 && incoming > 0){
                        stack.push(incoming);
                        break;
                    }else if ( stack.peek() < 0 && incoming > 0){
                        stack.push(incoming);
                        break;
                    }


                }


            }

        }

        int[] result = new int[stack.size()];
        for(int i = result.length-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;
    }

    public int[] asteroidCollision2(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int ast: asteroids) {
            collision: {
                while (!stack.isEmpty() && ast < 0 && 0 < stack.peek()) {
                    if (stack.peek() < -ast) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -ast) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }

        int[] ans = new int[stack.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = stack.pop();
        }
        return ans;
    }
}
