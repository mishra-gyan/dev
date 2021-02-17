package gfg.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckForBalanceParenthesis {

    @Test
    public void testisBalanced() {
        String input = "(([]))";
        Assertions.assertTrue(CheckForBalanceParenthesis.isBalanced(input));
    }

    @Test
    public void testNotBalanced() {
        String input = "(([])";

        Assertions.assertFalse(CheckForBalanceParenthesis.isBalanced(input));
    }
}
