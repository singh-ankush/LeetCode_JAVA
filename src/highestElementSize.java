import java.util.*;

class highestElementSize {
    
    public static Set<Integer> getIntMap(Set<String> words){
        
        Set<Integer> intmap = new LinkedHashSet<>();
        
        for(String word : words){
            intmap.add(word.length());
        }
        
        return intmap;
    }
    
    public static int getHighest(Set<Integer> intmap){
        if (intmap.isEmpty()) {
            throw new IllegalArgumentException("Set cannot be empty");
        }

        Iterator<Integer> it = intmap.iterator();
        int high = it.next();

        while (it.hasNext()) {
            int num = it.next();
            if (num > high) {
                high = num;
            }
        }

        return high;
    }
    
    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<>();
        words.add("apple");
        words.add("banana");
        words.add("kiwi");
        words.add("grapefruit");
        
        Set<Integer> lengths = getIntMap(words);
        int highest = getHighest(lengths);
        
        System.out.println("Word lengths: " + lengths);
        System.out.println("Highest length: " + highest);
    }
}
