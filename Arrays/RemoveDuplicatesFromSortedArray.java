public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int arr[] = {1,1,2,3,4,4,5};
        int n= arr.length;
        int l=0;
        int r=1;
        while(l<n && r<n){
            if(arr[l] != arr[r]){
                l++;
                arr[l] = arr[r];
            }
            r++;
        }
        System.out.print("Array after removing duplicates: ");
        for(int i=0; i<=l; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
 