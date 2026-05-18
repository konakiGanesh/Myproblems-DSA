public class FindMaxAndMin {
    public static void main(String[] args){
        int arr[] = {34,4,56,35,67,89,90};
        int max = arr[0];
        int min = arr[0];
        for(int num : arr){
            if(num > max){
                max =num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
    }
}
