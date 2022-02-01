package org.example;

import junit.framework.TestCase;

public class JimTest extends TestCase {

    public void testJimLikesWord() {
        Grandma J = new Jim();
        assertTrue(J.likesWord("journalism"));
        assertFalse(J.likesWord("joker"));
        assertFalse(J.likesWord(""));

    }
}