package Strings;
public class CheckingPalindromeUsingTP {
    public static void main(String[] args){
        String str = "GanaG";
        int l=0;
        int r = str.length()-1;
        boolean isPalindrome = true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(isPalindrome);
    }
}
