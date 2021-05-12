package ru.aklementev.html.parser.printer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.aklementev.html.parser.model.Result;

public class ConsolePrinter implements Printer {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void print(Result result) {
        logger.info(result.toString());
    }
}
