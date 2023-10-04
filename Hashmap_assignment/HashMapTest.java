import java.util.HashMap;
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("numb", "Im tired of being what you want me to be.");
        map.put("battle", "Im the best there is, Ill knock you out like everyone else.");
        map.put("love", "Youre the stars of my life.");
        map.put("pinay", "I love me a morena.");
        System.out.println(map.get("pinay"));

        for(String key : map.keySet()){
            System.out.printf("Track: %s\n Lyrics: %s\n", key, map.get(key));
        }
    }
}