package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static List<String> knownWords;

    public static void main(String[] args) {
        knownWords = new ArrayList<>();
        //This code below will populate the knownWords list with about 27,000 English words.
        try {
            BufferedReader br = new BufferedReader(new FileReader("common_words.txt"));
            String nextWord;
            while ((nextWord = br.readLine()) != null) {
                knownWords.add(nextWord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = 5;
        while (i > 0) {
            Grandma grandma = new Jim();
            System.out.println(grandma.getName());
            System.out.println("Enter a word here:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if (grandma.likesWord(str)) {
                System.out.println("I like that word!");
            }
            else if(!knownWords.contains(str)) {
                System.out.println("I'm not sure what that word means.");
            }
            else {
                System.out.println("That word is trash!");
                --i;
                System.out.println("You have " + i + " trys left...");
            }
        }
    }
}

//        int i = 5;
//        while (i > 0) {
//
//            Scanner scan = new Scanner(System.in);
//            String word = scan.nextLine();
//            hasDoubleLetters(word);
//             if(hasDoubleLetters(word) == false) {
//                System.out.println("I hate that word");
//                --i;
//                System.out.println("You have " + i + " trys left!");
//
//            } else {
//                System.out.println("I love that word");
//                System.out.println("You have " + i + " trys left!");
//
//            }
//        }
//    }






