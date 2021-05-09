package ru.aklementev.html.app_parser.counter;

import ru.aklementev.html.app_parser.model.Result;

import java.util.ArrayList;

public interface Counter {
    Result count(ArrayList<String> words);

}

