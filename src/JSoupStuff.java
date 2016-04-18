import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupStuff {
	public static void main(String[] args) {
		String url = new String("https://www.google.com/");
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Elements paragraphs = doc.select(".mw-content-ltr p");

	    Element firstParagraph = paragraphs.first();
	    Element lastParagraph = paragraphs.last();
	    Element p;
	    int i=1;
	    p=firstParagraph;
	    System.out.println(p.text());
	    while (p!=lastParagraph){
	        p=paragraphs.get(i);
	        System.out.println(p.text());
	        i++;
	    } 
	}
}
