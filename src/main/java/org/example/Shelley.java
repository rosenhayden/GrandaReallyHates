package org.example;

public class Shelley extends Grandma {
    public Shelley() {
        super("Shelly");
    }

    @Override
    public boolean likesWord(String str) {
        if (str.length() == 0){
            return false;
        }

        return str.endsWith("y");
    }


}
