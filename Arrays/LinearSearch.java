public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {22,4,23,14,52,45,1,0,6};
        int n = arr.length;
        int target = 45;
        for(int i=0; i<n ; i++){
            if(arr[i]==target){
                System.out.println("Element found at index: " + i); //index =i this returns the indexof the target element
                return; // this will exit the main method after finding the target element
            }
        }
        System.out.println("Element not found in the array"); // this will print if the target element is not found in the array
    }
}
