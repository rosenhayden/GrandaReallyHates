package org.example;

public class Jim extends Grandma {
    public Jim() {
        super("Jim");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.equals("Jim")) {
            return true;
        }
        return false;
    }

}
