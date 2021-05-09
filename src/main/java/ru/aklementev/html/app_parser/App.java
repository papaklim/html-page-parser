package ru.aklementev.html.app_parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.aklementev.html.app_parser.loader.HtmlLoader;
import ru.aklementev.html.app_parser.parser.HtmlParser;
import ru.aklementev.html.app_parser.printer.ResultPrinter;


public class App {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.info("Start parsing...");
        start(args);
        logger.info("Finished parsing");

    }

    public static void start(String[] urls) {
        new MagicMakerWithData(new HtmlLoader(), new HtmlParser(), new ResultPrinter()).doMagicWith(urls);
    }
}
