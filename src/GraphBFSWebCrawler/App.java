package GraphBFSWebCrawler;

public class App {

    public static void main(String[] args) {

        WebCrawler crawler = new WebCrawler();

        String rootUrl = "http://pwr.edu.pl";

        crawler.discoverWeb(rootUrl);
    }
}
