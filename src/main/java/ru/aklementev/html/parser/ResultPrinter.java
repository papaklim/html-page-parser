package ru.aklementev.html.parser;

public class ResultPrinter implements Printer{
    @Override
    public void print(Result result) {
        System.out.println(result.toString());
    }
}
