import java.util.Arrays;
import java.util.Collections;

class listPalindrome {
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
    int right = arr.length - 1;
    
    while (left < right) {
        if (arr[left] != arr[right]) {
            return false;
        }
        
        left++;
        right--;
    }
    return true;
    }
    
    public static void main(String[] args){
        int[] nums = {3,5,1,1,5,3};
        System.out.println(isPalindrome(nums));
    }
}
