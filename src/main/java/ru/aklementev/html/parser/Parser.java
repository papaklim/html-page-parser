package ru.aklementev.html.parser;

import java.io.File;
import java.io.IOException;

public interface Parser {

    Result parseHtml(File file) throws IOException;

}