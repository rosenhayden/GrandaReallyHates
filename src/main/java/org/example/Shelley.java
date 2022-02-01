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
        if(str.substring(str.length() - 1).equals("y")) {
            return true;
        }
        return false;
    }


}
