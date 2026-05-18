public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {22,4,23,14,52,45,1,0,6};
        int n = arr.length;
        int target = 45;
        boolean found = false;
        for(int i=0; i<n ; i++){
            if(arr[i]==target){
                found=true;
                System.out.println("Element found at index: " + i); //index =i this returns the indexof the target element
                break;
            }
        }
        System.out.println(found);
    }
}
