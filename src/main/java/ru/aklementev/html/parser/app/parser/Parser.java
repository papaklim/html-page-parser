package ru.aklementev.html.parser.app.parser;

import ru.aklementev.html.parser.app.model.Result;

import java.io.File;
import java.io.IOException;

public interface Parser {

    Result parseHtml(File file) throws IOException;

}
