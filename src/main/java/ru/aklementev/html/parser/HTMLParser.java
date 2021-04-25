package ru.aklementev.html.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HTMLParser {

    public HTMLParser() {
    }

    public String getHtml(String url) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        int responseStatus = conn.getResponseCode();
        System.out.println(responseStatus);
        String rawString = "";
        if (responseStatus == 200) {
            String line;
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            rawString = sb.toString();
        }
        return rawString;
    }
}
