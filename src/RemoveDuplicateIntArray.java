import java.util.HashSet;

public class RemoveDuplicateIntArray {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0; // last unique index
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // move unique element forward
            }
        }

        return i + 1;
    }

    static void main() {
        int[] nums = {1,1,2,3,3,4,6,6};
        System.out.println(removeDuplicates(nums));
    }
}
