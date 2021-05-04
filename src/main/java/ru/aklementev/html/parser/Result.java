package ru.aklementev.html.parser;

import java.util.HashMap;
import java.util.Map;

public class Result {

    Map<String, Integer> wordCountMap = new HashMap<>();

    public void addToResult(String word) {
        wordCountMap.merge(word, 1, Integer::sum);
    }

    @Override
    public String toString() {
        return "Result: " +
                wordCountMap +
                '"';
    }
}
