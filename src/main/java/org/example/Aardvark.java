package org.example;

public class Aardvark extends Grandma {
    public Aardvark() {
        super("Betty");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i)== str.charAt(i +1)) {
                return true;
            }

        }
        return false;
    }
}
