package ru.aklementev.html.app.di;

import com.google.inject.AbstractModule;
import ru.aklementev.html.app.counter.Counter;
import ru.aklementev.html.app.counter.WordsCounter;
import ru.aklementev.html.app.loader.HtmlLoader;
import ru.aklementev.html.app.loader.Loader;
import ru.aklementev.html.app.parser.HtmlParser;
import ru.aklementev.html.app.parser.Parser;
import ru.aklementev.html.app.printer.Printer;
import ru.aklementev.html.app.printer.ConsolePrinter;
import ru.aklementev.html.app.splitter.Splitter;
import ru.aklementev.html.app.splitter.StringSplitter;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Loader.class).to(HtmlLoader.class);
        bind(Parser.class).to(HtmlParser.class);
        bind(Printer.class).to(ConsolePrinter.class);
        bind(Splitter.class).to(StringSplitter.class);
        bind(Counter.class).to(WordsCounter.class);
    }
}
