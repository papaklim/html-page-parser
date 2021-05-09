package ru.aklementev.html.app_parser.loader;

import java.io.File;
import java.io.IOException;

public interface Loader {

    File downloadPage(String url) throws IOException;

}
