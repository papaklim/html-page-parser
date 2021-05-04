package ru.aklementev.html.parser;

import java.io.File;
import java.io.IOException;

public class MagicMakerWithData {
//    public MagicMakerWithData(Loader loader, Parser parser, Printer printer) {
//        this.loader = loader;
//        this.parser = parser;
//        this.printer = printer;
//    }

    Loader loader = new SimpleLoader();
    Parser parser = new HtmlParser();
    Printer printer = new ResultPrinter();


    public void doMagicWith(String url) throws IOException {
        File file = loader.downloadPage(url);
        Result result = parser.parseHtml(file);
        printer.print(result);
    }
}
