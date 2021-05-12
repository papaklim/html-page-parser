package ru.aklementev.html.parser.parser;

import ru.aklementev.html.parser.model.Result;

import java.io.File;
import java.io.IOException;

public interface Parser {

    Result parseHtml(File file) throws IOException;

}
