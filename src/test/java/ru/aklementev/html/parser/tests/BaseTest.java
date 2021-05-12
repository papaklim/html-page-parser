package ru.aklementev.html.parser.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ru.aklementev.html.parser.di.AppModule;
import ru.aklementev.html.parser.loader.HtmlLoader;
import ru.aklementev.html.parser.parser.HtmlParser;
import ru.aklementev.html.parser.splitter.StringSplitter;

public class BaseTest {

    Injector injector = Guice.createInjector(new AppModule());
    StringSplitter stringSplitter = injector.getInstance(StringSplitter.class);
    HtmlParser htmlParser = injector.getInstance(HtmlParser.class);
    HtmlLoader htmlLoader =injector.getInstance(HtmlLoader.class);


}
