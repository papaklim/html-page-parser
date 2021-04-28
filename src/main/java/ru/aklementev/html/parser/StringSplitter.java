package ru.aklementev.html.parser;

import java.util.ArrayList;

public class StringSplitter implements Splitter {

    @Override
    public ArrayList<String> getSplittedArray(String rawString) {
        String delims = "[ .,?!\";:()\\n\\r\\t\\[\\]><«»'/\\\\%@&=]+";
        String[] rawWords = rawString.split(delims);
        ArrayList<String> goodWords = new ArrayList<>();
        for (String word : rawWords) {
            if (word.length() >= 2 &&
                    word.matches("^[а-яА-Я]+\\*?$|^IT-.*$")) {
                if (word.endsWith("*")) {
                    goodWords.add(word.substring(0, word.length() - 1).toUpperCase());
                } else
                    goodWords.add(word.toUpperCase());
            }
        }
        return goodWords;
    }
}


