package org.example;

import junit.framework.TestCase;

public class BarbaraTest extends TestCase {

    public void testAardvarkLikesWord() {
        Grandma B = new Aardvark();
        assertTrue(B.likesWord("aardvark"));
        assertFalse(B.likesWord("joker"));
        assertFalse(B.likesWord(""));

    }
}