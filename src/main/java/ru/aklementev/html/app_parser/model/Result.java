package ru.aklementev.html.app_parser.model;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Result {

    private final Map<String, Integer> wordCountMap = new HashMap<>();

    public void addToResult(String word) {
        wordCountMap.merge(word, 1, Integer::sum);
    }

    @Override
    public String toString() {
        return wordCountMap.keySet().stream()
                .map(key -> key + "-" + wordCountMap.get(key))
                .collect(Collectors.joining("\n"));
    }
}
