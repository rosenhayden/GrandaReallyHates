package org.example;

import junit.framework.TestCase;

public class AnaTest extends TestCase {

    public void testAnaLikesWord() {
        Grandma A = new Ana();
        assertTrue(A.likesWord("that"));
        assertFalse(A.likesWord("joker"));
        assertFalse(A.likesWord(""));

    }
}