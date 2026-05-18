public class Running_sum_of_1Darray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        for (int i=1; i<n ; i++) {
            arr[i] += arr[i-1]; // arr[i] = arr[i] + arr[i-1]
        }
        System.out.println("Running sum of 1D array is: ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}