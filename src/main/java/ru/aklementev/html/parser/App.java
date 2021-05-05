package ru.aklementev.html.parser;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        start();
    }

    public static void start() throws IOException {
//        new MagicMakerWithData(new SimpleLoader(), new HtmlParser(), new ResultPrinter()).doMagicWith("https://www.simbirsoft.com/");
        new MagicMakerWithData(new SimpleLoader(), new HtmlParser(), new ResultPrinter()).doMagicWith("https://bash.im/");
    }
}
