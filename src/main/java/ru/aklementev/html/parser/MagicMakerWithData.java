package ru.aklementev.html.parser;

import java.io.IOException;
import java.util.ArrayList;

public class MagicMakerWithData {
    Parser parser = new HtmlParser();
    Splitter splitter = new StringSplitter();
    Counter counter = new WordsCounter();

    public void doMagicWith(String url) throws IOException {
        String parsedString = parser.parseHtml(url);
        ArrayList<String> splittedWords = splitter.getSplittedArray(parsedString);
        counter.count(splittedWords);
    }
}
