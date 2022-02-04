package org.example;

import junit.framework.TestCase;

public class BettyTest extends TestCase {

    public void testBettyLikesWord() {
        Grandma Be = new Aardvark();
        assertTrue(Be.likesWord("aardvark"));
        assertFalse(Be.likesWord("joker"));
        assertFalse(Be.likesWord(""));

    }
}