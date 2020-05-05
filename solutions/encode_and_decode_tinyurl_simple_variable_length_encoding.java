public class Codec
{
    String chars = "0123456789abcdefghijklmnopqrstuvwxyz";
    
    HashMap<String, String> map = new HashMap<String, String>();
    int count = 1;
    
    public String getString()
    {
        int c = count;
        StringBuilder sb = new StringBuilder();
        while(c > 0)
        {
            c--;
            sb.append(chars.charAt(c%62));
            c /= 62;
        }
        
        return sb.toString();   
    }
    
    public String encode(String longUrl)
    {
        String key = getString();
        map.put(key, longUrl);
        count++;
        return "http://tinyurl.com/" + key;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl)
    {
        return map.get((shortUrl.replace("http://tinyurl.com/", "")));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
