import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Wrap me 09 on 07-09-2017.
 */
public class parafrompagelink {
    public static void main(String args[]) throws IOException {

        Document page = Jsoup.connect("http://indianexpress.com/article/india/gauri-lankesh-murder-cctv-footage-shows-man-wearing-helmet-firing-at-her-4832265/").timeout(100000).get();
        String s1 ="";
        try {
            Elements src = page.getElementsByTag("p");
            for (Element e : src) {

                    s1 = s1 +'\n'+e.text();

            }
            System.out.println(s1);
        } catch (Exception e) {
            System.out.println("null");
        }
    }
}
