package ru.aklementev.html.parser.tests;

import org.junit.jupiter.api.Test;
import ru.aklementev.html.parser.loader.HtmlLoader;
import ru.aklementev.html.parser.loader.Loader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class HtmlLoaderTest extends BaseTest {

    @Test
    void downloadPageUrlWithCorrectUrl() throws IOException {
        assertFalse(Files.exists(filePath));
        htmlLoader.downloadPage(CORRECT_URL);
        assertTrue(Files.exists(filePath));
        Files.delete(filePath);
    }

    @Test
    void downloadPageUrlWithoutProtocol() {
        Loader htmlLoader = new HtmlLoader();
        assertThrows(MalformedURLException.class, () -> {
            htmlLoader.downloadPage(URL_WITHOUT_PROTOCOL);
        });
    }

    @Test
    void downloadPageUrlUnknownHost() {
        Loader htmlLoader = new HtmlLoader();
        assertThrows(UnknownHostException.class, () -> {
            htmlLoader.downloadPage(URL_WITH_UNKNOWN_HOST);
        });
    }
}
