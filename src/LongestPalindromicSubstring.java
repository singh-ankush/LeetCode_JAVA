public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        String longest = "";

        for(int i = 0; i < s.length(); i++){

            for(int j = i + 1; j <= s.length(); j++){

                String str = s.substring(i, j);

                StringBuffer sb = new StringBuffer(str);

                if(sb.reverse().toString().equals(str) && str.length() > longest.length()){
                    longest = str;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abaccus"));
    }
}