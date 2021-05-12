package ru.aklementev.html.parser.counter;

import ru.aklementev.html.parser.model.Result;

import java.util.ArrayList;

public interface Counter {
    Result count(ArrayList<String> words);

}

