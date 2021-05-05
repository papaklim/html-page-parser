package ru.aklementev.html.parser;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;


public class App {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            logger.error("Invalid number of arguments");
            throw new ArrayIndexOutOfBoundsException();
        }
        logger.info("Start parsing...");
        start(args[0]);
        logger.info("Finished parsing");

    }

    public static void start(String url) throws IOException {
        new MagicMakerWithData(new HtmlLoader(), new HtmlParser(), new ResultPrinter()).doMagicWith(url);
    }
}
