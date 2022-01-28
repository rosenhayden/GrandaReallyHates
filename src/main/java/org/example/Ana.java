package org.example;

public class Ana extends Grandma {
    public Ana() {
        super("Ane");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return true;
        }
        return false;
    }
}
