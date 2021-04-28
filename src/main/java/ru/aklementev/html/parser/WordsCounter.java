package ru.aklementev.html.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordsCounter implements Counter {

    @Override
    public void count(ArrayList<String> words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.merge(word, 1, Integer::sum);
        }
        System.out.println(result);
    }
}
