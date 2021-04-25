package ru.aklementev.html.parser;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {
        start();
    }

    public static void start() throws IOException {
        HTMLParser parser = new HTMLParser();
        Splitter splitter = new Splitter();
//        Scanner scan = new Scanner(System.in);
//        String inputUrl = scan.nextLine();
//        String inputUrl = "https://www.simbirsoft.com/";
        String inputUrl = "https://bash.im/";
        String rawText = parser.getHtml(inputUrl);
        splitter.getSplittedText(rawText);
    }
}
