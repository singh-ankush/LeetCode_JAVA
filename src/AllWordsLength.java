import java.util.*;

class AllWordsLength {
    
    public static int getTotalLength(Set<String> words){
    int sum = 0;
    
    for(String word : words){
        sum += word.length();
    }
    
        return sum;
    }
    
    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<>();
        words.add("apple");
        words.add("banana");
        words.add("kiwi");
        words.add("grapefruit");
        
        int lengths = getTotalLength(words);
        
        System.out.println("All length: " + lengths);
    }
}
