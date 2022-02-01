package org.example;

public class Barbara extends Grandma {
    public Barbara() {
        super("Barbara");
    }

    @Override
    public boolean likesWord(String str) {
        char someChar = 'a';
        int count = 0;
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar) {
                count++;
            }
            if (count == 3) {
                return true;
            }

        }
        return false;
    }
}
