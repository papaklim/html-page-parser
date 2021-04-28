package ru.aklementev.html.parser;

import java.io.IOException;

public interface Parser {

    String parseHtml(String url) throws IOException;

}
