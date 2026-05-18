public class ReverseAnArray {
    public static void main(String[] args){
        // int arr[] = {34,4,56,35,67,89,90};
        // int n = arr.length;
        // for (int i=n-1; i>=0; i--){
        //     System.out.println(arr[i]+ " ");
        // }
        // two pointer approach
        int arr[] = {34,4,56,35,67,89,90};
        int l =0;
        int r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l]= arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
