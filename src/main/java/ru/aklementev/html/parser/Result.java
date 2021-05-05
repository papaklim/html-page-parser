package ru.aklementev.html.parser;

import java.util.HashMap;
import java.util.Map;

public class Result {

    private final Map<String, Integer> wordCountMap = new HashMap<>();

    public void addToResult(String word) {
        wordCountMap.merge(word, 1, Integer::sum);
    }


    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        for (Map.Entry<String, Integer> thisEntry : wordCountMap.entrySet()) {
            Object key = thisEntry.getKey();
            Object value = thisEntry.getValue();
            resultString.append(key.toString()).append(": ").append(value.toString()).append("\n");
        }
        return resultString.toString();
    }
}
