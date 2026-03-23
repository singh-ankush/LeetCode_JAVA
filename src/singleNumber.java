import java.util.*;

class Solution {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        
        for (int n : nums) {
            if (!s1.add(n)) {
                s2.add(n);
            }
        }
        
        s1.removeAll(s2);
        
        // Get the remaining element
        return s1.iterator().next();
    }
    
    public static void main(String[] args){
        int[] nums = {2,4,4,5,6,8,2,6,5};
        System.out.println(singleNumber(nums));
    }
}
