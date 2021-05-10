package ru.aklementev.html.app_parser.di;

import com.google.inject.AbstractModule;
import ru.aklementev.html.app_parser.loader.HtmlLoader;
import ru.aklementev.html.app_parser.loader.Loader;
import ru.aklementev.html.app_parser.parser.HtmlParser;
import ru.aklementev.html.app_parser.parser.Parser;
import ru.aklementev.html.app_parser.printer.Printer;
import ru.aklementev.html.app_parser.printer.ResultPrinter;

public class MagicMakerWithDataModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Loader.class).to(HtmlLoader.class);
        bind(Parser.class).to(HtmlParser.class);
        bind(Printer.class).to(ResultPrinter.class);
    }
}
