package ru.aklementev.html.parser;

import java.io.*;
import java.util.ArrayList;


public class HtmlParser implements Parser {
    private final Splitter splitter = new StringSplitter();
    private final Counter counter = new WordsCounter();


    @Override
    public Result parseHtml(File file) throws IOException {
        Result result = new Result();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String parsedString = bufferedReader.readLine();
        ArrayList<String> splittedString = splitter.getSplittedArray(parsedString);
        result = counter.count(splittedString);
        return result;

    }
}

