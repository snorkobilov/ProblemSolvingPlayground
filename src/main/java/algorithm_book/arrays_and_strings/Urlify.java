package algorithm_book.arrays_and_strings;

public class Urlify {
    public String urlIfy(String url) {
        return url.trim().replaceAll("\\s", "%20");
    }
}
