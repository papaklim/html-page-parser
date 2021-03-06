package ru.aklementev.html.parser;

import com.google.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.aklementev.html.parser.loader.Loader;
import ru.aklementev.html.parser.model.Result;
import ru.aklementev.html.parser.parser.Parser;
import ru.aklementev.html.parser.printer.Printer;

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
            logger.info("Something went wrong. For more information see protocol.log");
            logger.error(e.getMessage(), e);
        }
    }
}
