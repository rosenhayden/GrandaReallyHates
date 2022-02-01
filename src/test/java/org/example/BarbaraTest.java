package org.example;

import junit.framework.TestCase;

public class BarbaraTest extends TestCase {

    public void testBarbaraLikesWord() {
        Grandma B = new Barbara();
        assertTrue(B.likesWord("aardvark"));
        assertFalse(B.likesWord("joker"));
        assertFalse(B.likesWord(""));

    }
}