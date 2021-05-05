package ru.aklementev.html.parser;

import java.io.*;
import java.util.ArrayList;


public class HtmlParser implements Parser {
    private final Splitter splitter = new StringSplitter();
    private final Counter counter = new WordsCounter();


    @Override
    public Result parseHtml(File file) {
        Result result = new Result();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String parsedString;
            ArrayList<String> allGoodWords = new ArrayList<>();
            while ((parsedString = in.readLine()) != null) {
                ArrayList<String> splittedArray = splitter.getSplittedArray(parsedString);
                allGoodWords.addAll(splittedArray);
                result = counter.count(allGoodWords);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}

