package ru.aklementev.html.parser.app.di;

import com.google.inject.AbstractModule;
import ru.aklementev.html.parser.app.counter.Counter;
import ru.aklementev.html.parser.app.counter.WordsCounter;
import ru.aklementev.html.parser.app.loader.HtmlLoader;
import ru.aklementev.html.parser.app.loader.Loader;
import ru.aklementev.html.parser.app.parser.HtmlParser;
import ru.aklementev.html.parser.app.parser.Parser;
import ru.aklementev.html.parser.app.printer.Printer;
import ru.aklementev.html.parser.app.printer.ConsolePrinter;
import ru.aklementev.html.parser.app.splitter.Splitter;
import ru.aklementev.html.parser.app.splitter.StringSplitter;

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
