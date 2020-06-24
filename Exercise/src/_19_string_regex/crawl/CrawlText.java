package _19_string_regex.crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlText {
    public static void main(String[] args) throws IOException {
        try {
            // Code here
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scn = new Scanner(new InputStreamReader(url.openStream()));
            scn.useDelimiter("\\Z");
            String content = scn.next();
            scn.close();
            content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("<a title=\"(.*?)\" href=\"(.*?)\"><img title=");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
                System.out.println("https://dantri.com.vn" + m.group(2));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
