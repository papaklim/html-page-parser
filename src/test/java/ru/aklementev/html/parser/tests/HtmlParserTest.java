package ru.aklementev.html.parser.tests;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class HtmlParserTest extends BaseTest{

    final File NONEXISTENT_FILE = new File("test");

    @Test
    void parseHtmlNonexistentFile() {
        assertThrows(FileNotFoundException.class, () -> {
            htmlParser.parseHtml(NONEXISTENT_FILE);;
        });
    }
}
