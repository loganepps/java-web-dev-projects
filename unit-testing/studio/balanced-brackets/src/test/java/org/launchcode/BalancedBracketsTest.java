package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void onlyBracketsOnlyOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void onlyBracketsBackwards(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
    @Test
    public void onlyBracketsExtraOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }
    @Test
    public void onlyBracketsOnlyClosing(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    @Test
    public void onlyBracketsNested(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }
    @Test
    public void onlyBracketsEachCharInBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L][a][u][n][c][h][C][o][d][e]"));
    }
    @Test
    public void onlyBracketsExtraClose(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]]"));
    }
    @Test
    public void onlyBracketsEmptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsBackwardsMiddle(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void onlyBracketsOnlyBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


}
