package ru.aklementev.html.app_parser.di;

import com.google.inject.AbstractModule;
import ru.aklementev.html.app_parser.counter.Counter;
import ru.aklementev.html.app_parser.counter.WordsCounter;
import ru.aklementev.html.app_parser.splitter.Splitter;
import ru.aklementev.html.app_parser.splitter.StringSplitter;

public class HtmlParserModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Splitter.class).to(StringSplitter.class);
        bind(Counter.class).to(WordsCounter.class);
    }
}
