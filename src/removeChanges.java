import java.util.Arrays;

public class removeDuplicates {
    public static int[] deleteDuplicates(int[] nums) {
        if (nums.length == 0) return new int[0];

        int j = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return Arrays.copyOf(nums, j + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3};
        System.out.println(Arrays.toString(deleteDuplicates(nums)));
    }
}
