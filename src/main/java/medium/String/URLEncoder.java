package medium.String;

import java.util.HashMap;
import java.util.Map;

public class URLEncoder {

    Map<Integer, String> map = new HashMap<>();
    private final static String TINY_URL = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Integer hashCode = longUrl.hashCode();
        map.put(hashCode, longUrl);
        return TINY_URL + hashCode;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String decoded = shortUrl.replace(TINY_URL, "");

        return map.get(Integer.parseInt(decoded));
    }

}
