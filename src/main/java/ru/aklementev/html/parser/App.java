package ru.aklementev.html.parser;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.aklementev.html.parser.di.AppModule;


public class App {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Start parsing...");
        start(args);
        logger.info("Finished parsing");

    }

    public static void start(String[] urls) {
        Injector injector = Guice.createInjector(new AppModule());
        MagicMakerWithData magicMakerWithData = injector.getInstance(MagicMakerWithData.class);
        magicMakerWithData.doMagicWith(urls);
    }
}
