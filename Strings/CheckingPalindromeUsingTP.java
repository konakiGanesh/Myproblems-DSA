package Strings;
public class CheckingPalindromeUsingTP {
    public static void main(String[] args){
        // String str = "GanaG";
        // int l=0;
        // int r = str.length()-1;
        // boolean isPalindrome = true;
        // while(l<r){
        //     if(str.charAt(l)!=str.charAt(r)){
        //         isPalindrome = false;
        //         break;
        //     }
        //     l++;
        //     r--;
        // }
        // System.out.println(isPalindrome);
        String str ="A panama, GanaG";
        boolean isPalindrome = true;
        int left =0;
        int right = str.length()-1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            //case sensitive
            char l = Character.toLowerCase(str.charAt(left));
            char r = Character.toLowerCase(str.charAt(right));
            if (l != r) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
