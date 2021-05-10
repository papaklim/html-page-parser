package ru.aklementev.html.app_parser;

import com.google.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.aklementev.html.app_parser.loader.Loader;
import ru.aklementev.html.app_parser.model.Result;
import ru.aklementev.html.app_parser.parser.Parser;
import ru.aklementev.html.app_parser.printer.Printer;

import java.io.File;

public class MagicMakerWithData {
    private static final Logger logger = LogManager.getLogger();
    private final Loader loader;
    private final Parser parser;
    private final Printer printer;

    @Inject
    public MagicMakerWithData(Loader loader, Parser parser, Printer printer) {
        this.loader = loader;
        this.parser = parser;
        this.printer = printer;
    }

    public void doMagicWith(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Invalid number of arguments");
            }
            File file = loader.downloadPage(args[0]);
            Result result = parser.parseHtml(file);
            printer.print(result);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
