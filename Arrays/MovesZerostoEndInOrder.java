public class MovesZerostoEndInOrder {
    public static void main(String[] args){
        int arr[] = {0,1,0,3,0,12};
        int slow =0;
        for(int fast =0; fast< arr.length; fast++){
            if(arr[fast]!=0){
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                slow++;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
