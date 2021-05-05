package ru.aklementev.html.parser;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new ArrayIndexOutOfBoundsException("Invalid number of arguments");
        }
        start(args[0]);
    }

    public static void start(String url) throws IOException {
        new MagicMakerWithData(new HtmlLoader(), new HtmlParser(), new ResultPrinter()).doMagicWith(url);
    }
}
