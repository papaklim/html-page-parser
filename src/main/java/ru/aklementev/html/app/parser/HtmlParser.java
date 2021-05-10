package ru.aklementev.html.app.parser;

import com.google.inject.Inject;
import ru.aklementev.html.app.counter.Counter;
import ru.aklementev.html.app.model.Result;
import ru.aklementev.html.app.splitter.Splitter;

import java.io.*;
import java.util.ArrayList;


public class HtmlParser implements Parser {

    private final Splitter splitter;
    private final Counter counter;

    @Inject
    public HtmlParser(Splitter splitter, Counter counter) {
        this.splitter = splitter;
        this.counter = counter;
    }



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

