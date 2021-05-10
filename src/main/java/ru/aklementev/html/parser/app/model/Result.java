package ru.aklementev.html.parser.app.model;

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
        return "Result: \n" + wordCountMap.keySet().stream()
                .map(key -> key + "-" + wordCountMap.get(key))
                .collect(Collectors.joining("\n"));
    }
}
