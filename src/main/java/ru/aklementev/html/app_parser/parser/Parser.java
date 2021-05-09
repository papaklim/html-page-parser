package ru.aklementev.html.app_parser.parser;

import ru.aklementev.html.app_parser.model.Result;

import java.io.File;
import java.io.IOException;

public interface Parser {

    Result parseHtml(File file) throws IOException;

}
