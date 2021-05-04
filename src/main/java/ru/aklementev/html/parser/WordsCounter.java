package ru.aklementev.html.parser;

import java.util.ArrayList;

public class WordsCounter implements Counter {

    @Override
    public Result count(ArrayList<String> words) {
        Result result = new Result();
        for (String word : words) {
            result.addToResult(word);
        }
        return result;
    }
}
