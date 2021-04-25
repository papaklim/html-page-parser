package ru.aklementev.html.parser;

import java.util.ArrayList;

public class Splitter {
    public void getSplittedText(String rawText) {
        String delims = "[ .,?!\";:()\\n\\r\\t\\[\\]><«»'/\\\\%@&]+";
        String[] tokens = rawText.split(delims);

        for (String token : tokens) {
//            System.out.println(token);
            ArrayList<String> goodWords = new ArrayList<>();
            ArrayList<String> badWords = new ArrayList<>();
            if (token.length() <= 1
                    || token.matches("^[\\<\\>\\\\\\/\\-#'}{_=|+$&*@a-zA-Z0-9].+"))
{
                badWords.add(token);
//                for (String badWord : badWords) {
//                    System.out.println("Плохое слово: " + badWord);
//                }
            } else
                goodWords.add(token.toLowerCase());
            for (String goodWord : goodWords) {
                System.out.println("Хорошее слово: " + goodWord);
            }
        }
    }
}


