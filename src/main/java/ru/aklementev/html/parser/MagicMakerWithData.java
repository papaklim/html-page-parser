package ru.aklementev.html.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class MagicMakerWithData {
    private static final Logger logger = LogManager.getLogger();
    private final Loader loader;
    private final Parser parser;
    private final Printer printer;

    public MagicMakerWithData(Loader loader, Parser parser, Printer printer) {
        this.loader = loader;
        this.parser = parser;
        this.printer = printer;
    }

    public void doMagicWith(String url) {
        try {
            File file = loader.downloadPage(url);
            Result result = parser.parseHtml(file);
            printer.print(result);
        } catch (IOException e) {
            logger.error(e);
        }
    }
}
