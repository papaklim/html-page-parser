package ru.aklementev.html.parser.di;

import com.google.inject.AbstractModule;
import ru.aklementev.html.parser.counter.Counter;
import ru.aklementev.html.parser.counter.WordsCounter;
import ru.aklementev.html.parser.loader.HtmlLoader;
import ru.aklementev.html.parser.loader.Loader;
import ru.aklementev.html.parser.parser.HtmlParser;
import ru.aklementev.html.parser.parser.Parser;
import ru.aklementev.html.parser.printer.Printer;
import ru.aklementev.html.parser.printer.ConsolePrinter;
import ru.aklementev.html.parser.splitter.Splitter;
import ru.aklementev.html.parser.splitter.StringSplitter;

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
