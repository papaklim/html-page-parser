package ru.aklementev.html.app.counter;

import ru.aklementev.html.app.model.Result;

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
