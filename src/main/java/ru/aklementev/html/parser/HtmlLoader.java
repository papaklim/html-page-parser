package ru.aklementev.html.parser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HtmlLoader implements Loader {

    String defaultEncoding = "UTF-8";

    private String extractEncoding(HttpURLConnection conn) {
        String contentType = conn.getHeaderField("Content-Type");
        System.out.println(contentType.substring(contentType.lastIndexOf("=") + 1));
        return contentType.substring(contentType.lastIndexOf("=") + 1);
    }

    @Override
    public File downloadPage(String url) throws IOException {
        File file = new File("parsed_html_page.txt");
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        final String ENCODING = extractEncoding(conn);

        int responseStatus = conn.getResponseCode();
        if (responseStatus == HttpURLConnection.HTTP_OK) {
            String line;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), ENCODING));
                 Writer writer = new BufferedWriter(new OutputStreamWriter(
                         new FileOutputStream(file), defaultEncoding));
                 BufferedWriter out = new BufferedWriter(writer)) {
                while ((line = in.readLine()) != null) {
                    out.write(line);
                    out.newLine();
                }
            }
        }
        return file;
    }
}

