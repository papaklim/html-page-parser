package ru.aklementev.html.app_parser.parser;

import ru.aklementev.html.app_parser.counter.Counter;
import ru.aklementev.html.app_parser.counter.WordsCounter;
import ru.aklementev.html.app_parser.model.Result;
import ru.aklementev.html.app_parser.splitter.Splitter;
import ru.aklementev.html.app_parser.splitter.StringSplitter;

import java.io.*;
import java.util.ArrayList;


public class HtmlParser implements Parser {
    private final Splitter splitter = new StringSplitter();
    private final Counter counter = new WordsCounter();


    @Override
    public Result parseHtml(File file) throws IOException {
        Result result = new Result();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String parsedString;
            ArrayList<String> allGoodWords = new ArrayList<>();
            while ((parsedString = in.readLine()) != null) {
                ArrayList<String> splittedArray = splitter.getSplittedArray(parsedString);
                allGoodWords.addAll(splittedArray);
                result = counter.count(allGoodWords);
            }
        }
        return result;
    }
}

