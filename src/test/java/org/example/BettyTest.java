package org.example;

import junit.framework.TestCase;

public class BettyTest extends TestCase {

    public void testBettyLikesWord() {
        Grandma Be = new Betty();
        assertTrue(Be.likesWord("aardvark"));
        assertFalse(Be.likesWord("joker"));
        assertFalse(Be.likesWord(""));

    }
}