package ru.aklementev.html.app.counter;

import ru.aklementev.html.app.model.Result;

import java.util.ArrayList;

public interface Counter {
    Result count(ArrayList<String> words);

}

