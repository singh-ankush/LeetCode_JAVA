import java.util.*;

class FstLstSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        List<Integer> val = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                val.add(i);
            }
        }

        if (val.size() == 0) {
            return new int[]{-1, -1};
        }

        int first = val.get(0);
        int last = val.get(val.size() - 1);

        return new int[]{first, last};
    }
    
    public static void main(String[] args){
        int[] nums = {4,7,5,4,8,4};
        int[] result = searchRange(nums, 4);
        
        System.out.println(Arrays.toString(result));
    }
}
