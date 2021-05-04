package ru.aklementev.html.parser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleLoader implements Loader {

    @Override
    public File downloadPage(String url) throws IOException {
        File file = new File("ParsedStringFile.txt");
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        int responseStatus = conn.getResponseCode();
        if (responseStatus == 200) {
            try {
                String line;
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                FileWriter writer = new FileWriter(file, true);
                BufferedWriter out = new BufferedWriter(writer);
                StringBuilder sb = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    sb.append(line);
                }
                out.write(sb.toString());
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
