import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "mumbai is a city and mumbai is beautiful";

        str = str.toLowerCase();

        String[] words = str.split("\\s+");

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(freqMap.toString());
    }
}
