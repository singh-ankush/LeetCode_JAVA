import java.util.Arrays;

class insertPosition {
    public static int searchInsert(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        
        if (result < 0) {
            return -result - 1;
        }
        
        return result;
    }
    
    public static void main(String[] args){
        int[] nums = {2,4,5,6,8};
        System.out.println(searchInsert(nums, 3));
    }
}
