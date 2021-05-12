package ru.aklementev.html.parser.tests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSplitterTest extends BaseTest {

    @Test
    void getSplittedArrayWithAllDelims() {

        ArrayList<String> actual = stringSplitter.getSplittedArray(rawString);
        List<String> expected = List.of("ХХХ", "ПИСЬМО", "ОТ", "МОСЭНЕРГОСБЫТА", "ЕСЛИ", "ВЫ", "НЕ", "ВИДИТЕ", "ДАННОЕ",
                "ПИСЬМО", "ПЕРЕЙДИТЕ", "ПО", "ССЫЛКЕ", "ЧТОБЫ", "ПРОСМОТРЕТЬ", "ЕГО", "БРАУЗЕРЕ", "УУУ", "ЭТО", "РОССИЯ",
                "ДЕТКА", "СТРАНА", "НЕВИДИМЫХ", "ПИСЕМ", "ВАЖНЫМИ", "ССЫЛКАМИ", "ЭТО");
        assertEquals(expected, actual);
    }

    @Test
    void getSplittedArrayWithEmptyString() {
        ArrayList<String> actual = stringSplitter.getSplittedArray(emptyRawString);
        assertEquals(new ArrayList<String>(), actual);
    }
}
