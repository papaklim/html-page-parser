package ru.aklementev.html.parser.app.counter;

import ru.aklementev.html.parser.app.model.Result;

import java.util.ArrayList;

public interface Counter {
    Result count(ArrayList<String> words);

}

