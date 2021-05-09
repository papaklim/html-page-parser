package ru.aklementev.html.app_parser.printer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.aklementev.html.app_parser.model.Result;

public class ResultPrinter implements Printer {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void print(Result result) {
        logger.info(result.toString());
    }
}
