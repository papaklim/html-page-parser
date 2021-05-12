package ru.aklementev.html.parser.loader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HtmlLoader implements Loader {

    private static final Logger logger = LogManager.getLogger();

    private static final String METHOD = "GET";
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";

    private String extractEncoding(HttpURLConnection conn) {
        String contentType = conn.getHeaderField(CONTENT_TYPE_HEADER);
        if (contentType != null) {
            return contentType.substring(contentType.lastIndexOf("=") + 1);
        }
        logger.warn("Will be used default encoding \"UTF-8\"");
        return DEFAULT_ENCODING;
    }

    @Override
    public File downloadPage(String url) throws IOException {
        File file = new File("parsed_html_page.txt");
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod(METHOD);
        String encoding = extractEncoding(conn);

        int responseStatus = conn.getResponseCode();
        if (responseStatus == HttpURLConnection.HTTP_OK) {
            String line;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), encoding));
                 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
                         new FileOutputStream(file), DEFAULT_ENCODING));) {
                while ((line = in.readLine()) != null) {
                    out.write(line);
                    out.newLine();
                }
            }
        }
        return file;
    }
}

