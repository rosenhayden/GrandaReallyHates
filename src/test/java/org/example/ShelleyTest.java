package org.example;

import junit.framework.TestCase;

public class ShelleyTest extends TestCase {

    public void testShellyLikesWord() {
    Grandma S = new Shelley();
    assertTrue(S.likesWord("tiny"));
    assertFalse(S.likesWord("joker"));
    assertFalse(S.likesWord(""));

    }
}