package gfg.easy;

import java.util.ArrayDeque;

public class CheckForBalanceParenthesis {

    final static char openBracket = '(', closeBracket = ')';
    final static char openSqBracket = '[', closeSqBracket = ']';
    final static char openCurlyBracket = '{', closeCurlyBracket = '}';

    public static void main(String[] args) {
        String input = "(([]))";
        System.out.printf("for Input: %s, IsBalanced is: %s", input, isBalanced(input));
    }


     static boolean isBalanced(String input) {

        if (input == null || input.length() == 0)
            return false;

        char[] inputArray = input.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>(inputArray.length);
         for (char c : inputArray) {
             if (stack.isEmpty()) {
                 if (c == openBracket || c == openSqBracket || c == openCurlyBracket)
                     stack.push(c);
                 else return false;
             } else {
                 char charInStack = stack.peek();
                 if ((charInStack == openBracket && c == closeBracket)
                         || charInStack == openSqBracket && c == closeSqBracket
                         || charInStack == openCurlyBracket && c == closeCurlyBracket) {
                     stack.pop();
                 } else {
                     stack.push(c);
                 }

             }
         }

        return stack.isEmpty();
    }
}
