package ru.aklementev.html.app_parser.splitter;

import java.util.ArrayList;

public class StringSplitter implements Splitter {

    private static final String DELIMS = "[ .,?!\";:()\\n\\r\\t\\[\\]><«»'/\\\\%@&=]+";
    private static final String REGEXP_VALUE = "^[а-яА-Я]+\\*?$|^IT-.*$";

    @Override
    public ArrayList<String> getSplittedArray(String rawString) {
        String[] rawWords = rawString.split(DELIMS);
        ArrayList<String> goodWords = new ArrayList<>();
        for (String word : rawWords) {
            if (word.length() >= 2 &&
                    word.matches(REGEXP_VALUE)) {
                if (word.endsWith("*")) {
                    goodWords.add(word.substring(0, word.length() - 1).toUpperCase());
                } else
                    goodWords.add(word.toUpperCase());
            }
        }
        return goodWords;
    }
}


