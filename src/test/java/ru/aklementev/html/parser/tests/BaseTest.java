package ru.aklementev.html.parser.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ru.aklementev.html.parser.di.AppModule;
import ru.aklementev.html.parser.loader.HtmlLoader;
import ru.aklementev.html.parser.parser.HtmlParser;
import ru.aklementev.html.parser.splitter.StringSplitter;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseTest {
    final String rawString = "ХХХ[ПИСЬМО.ОТ,МОСЭНЕРГОСБЫТА?ЕСЛИ!ВЫ\"НЕ;ВИДИТЕ:ДАННОЕ(ПИСЬМО)ПЕРЕЙДИТЕ\nПО\rССЫЛКЕ" +
            "\tЧТОБЫ>ПРОСМОТРЕТЬ<ЕГО«БРАУЗЕРЕ»УУУ'ЭТО\\РОССИЯ/ДЕТКА%СТРАНА@НЕВИДИМЫХ&ПИСЕМ=ВАЖНЫМИ]ССЫЛКАМИ ЭТО";
    final String emptyRawString = "";

    final String URL_WITHOUT_PROTOCOL = "test";
    final String URL_WITH_UNKNOWN_HOST = "http://bash.mi/";
    final String CORRECT_URL = "http://bash.im/";

    final File NONEXISTENT_FILE = new File("test");

    final Path filePath = Paths.get("parsed_html_page.txt");


    Injector injector = Guice.createInjector(new AppModule());
    StringSplitter stringSplitter = injector.getInstance(StringSplitter.class);
    HtmlParser htmlParser = injector.getInstance(HtmlParser.class);
    HtmlLoader htmlLoader = injector.getInstance(HtmlLoader.class);

}
