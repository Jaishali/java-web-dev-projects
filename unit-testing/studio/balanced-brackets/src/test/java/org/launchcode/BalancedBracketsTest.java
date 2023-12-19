package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest()
    {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        String meassage = "a single set of balanced returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void singleBracketsBeforeTheCharacters(){
        String message = "balanced brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,message);
    }
    @Test
    public void singleBracketsAroundOtherCharacters() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void singleBracketsAmongOtherCharacters() {
        String message = "balanced brackets among other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void tripleBalancedBrackets() {
        String message = "three consecutive pairs of brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "three nested pairs of brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void singleOpeningBrackets(){
        String message = "a single opening brackets returns true";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }
    @Test
    public void singleClosingBrackets(){
        String message = "a single closing brackets return true";
        String testData ="]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }
    @Test
    public void reversedBrackets(){
        String message = "A reversed brackets return false";
        String testData ="][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }
    @Test
    public void singleBracketsWithOtherCharacters(){
        String message = "a single opening brackets with other characters";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result,message);
    }
    @Test
    public void unbalancedBracketsAmongOtherCharacters(){
        String message = "unbalanced brackets among other characters returns false ";
        String testData = "Launch]Code[";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results,message);
    }
    @Test
    public void mixOfUnbalancedBrackets(){
        String message = "a mix of unbalanced brackets return false";
        String testData = "[[]][][";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(results,message);
    }
    @Test
    public void stringOfCharactersWithoutBrackets(){
        String message = "A string of characters without brackets return true";
        String testData = "LaunchCode";
        boolean result= BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,message);
    }
    @Test
    public void emptyString(){
        String message = "an empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,message);
    }


}