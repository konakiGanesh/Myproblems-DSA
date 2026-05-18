package Strings;

public class ReverseStringUsingTP {
    public static void main(String[] args){
        String str = "Ganesh";
        char arr[] = str.toCharArray();
        int l =0;
        int r = arr.length-1;
        while(l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(new String(arr));
    }
}
