package ru.aklementev.html.parser.tests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSplitterTest extends BaseTest {

    @Test
    void getSplittedArrayWithAllDelims() {
        String rawString = "ХХХ[ПИСЬМО.ОТ,МОСЭНЕРГОСБЫТА?ЕСЛИ!ВЫ\"НЕ;ВИДИТЕ:ДАННОЕ(ПИСЬМО)ПЕРЕЙДИТЕ\nПО\rССЫЛКЕ" +
                "\tЧТОБЫ>ПРОСМОТРЕТЬ<ЕГО«БРАУЗЕРЕ»УУУ'ЭТО\\РОССИЯ/ДЕТКА%СТРАНА@НЕВИДИМЫХ&ПИСЕМ=ВАЖНЫМИ]ССЫЛКАМИ ЭТО";
        ArrayList<String> actual = stringSplitter.getSplittedArray(rawString);
        List<String> expected = List.of("ХХХ", "ПИСЬМО", "ОТ", "МОСЭНЕРГОСБЫТА", "ЕСЛИ", "ВЫ", "НЕ", "ВИДИТЕ", "ДАННОЕ",
                "ПИСЬМО", "ПЕРЕЙДИТЕ", "ПО", "ССЫЛКЕ", "ЧТОБЫ", "ПРОСМОТРЕТЬ", "ЕГО", "БРАУЗЕРЕ", "УУУ", "ЭТО", "РОССИЯ",
                "ДЕТКА", "СТРАНА", "НЕВИДИМЫХ", "ПИСЕМ", "ВАЖНЫМИ", "ССЫЛКАМИ", "ЭТО");
        assertEquals(expected, actual);
    }

    @Test
    void getSplittedArrayWithEmptyString() {
        String rawString = "";
        ArrayList<String> actual = stringSplitter.getSplittedArray(rawString);
        assertEquals(new ArrayList<String>(), actual);
    }
}
