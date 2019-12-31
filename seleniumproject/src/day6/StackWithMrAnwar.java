package day6;

import java.util.Stack;

public class StackWithMrAnwar {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        stack.push(9);
        stack.push(2);

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
            //print first
        }



        };
    }


    //https://leetcode.com/problems/valid-parentheses/

