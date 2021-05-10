package ru.aklementev.html.app.parser;

import ru.aklementev.html.app.model.Result;

import java.io.File;
import java.io.IOException;

public interface Parser {

    Result parseHtml(File file) throws IOException;

}
