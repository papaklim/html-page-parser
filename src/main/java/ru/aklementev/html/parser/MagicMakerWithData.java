package ru.aklementev.html.parser;

import java.io.File;
import java.io.IOException;

public class MagicMakerWithData {
    private final Loader loader;
    private final Parser parser;
    private final Printer printer;

    public MagicMakerWithData(Loader loader, Parser parser, Printer printer) {
        this.loader = loader;
        this.parser = parser;
        this.printer = printer;
    }

    public void doMagicWith(String url) throws IOException {
        File file = loader.downloadPage(url);
        Result result = parser.parseHtml(file);
        printer.print(result);
    }
}
