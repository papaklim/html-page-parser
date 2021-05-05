package ru.aklementev.html.parser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HtmlLoader implements Loader {

    @Override
    public File downloadPage(String url) throws IOException {
        File file = new File("ParsedTHtmlFile.txt");
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        int responseStatus = conn.getResponseCode();
        if (responseStatus == HttpURLConnection.HTTP_OK) {
            String line;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                 FileWriter writer = new FileWriter(file, false);
                 BufferedWriter out = new BufferedWriter(writer)) {
                while ((line = in.readLine()) != null) {
                    out.write(line);
                    out.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
