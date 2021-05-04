package ru.aklementev.html.parser;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        start();
    }

    public static void start() throws IOException {
//        new MagicMakerWithData().doMagicWith("https://www.simbirsoft.com/");
        new MagicMakerWithData().doMagicWith("https://bash.im/");
    }
}
