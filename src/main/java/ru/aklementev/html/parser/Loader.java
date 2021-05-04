package ru.aklementev.html.parser;

import java.io.File;
import java.io.IOException;

public interface Loader {

    public File downloadPage(String url) throws IOException;

}
