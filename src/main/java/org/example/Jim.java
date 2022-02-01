package org.example;

public class Jim extends Grandma {
    public Jim() {
        super("Jim");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() == 0){
            return false;
        }
        if (str.charAt(0) == ('j') && 'm' == str.charAt(str.length() - 1)) {
            return true;
        }
        return false;
    }

}
