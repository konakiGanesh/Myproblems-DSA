public class Concatinate_two_arrays{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int n = arr1.length;
        int[] ans = new int[n + n];
        for (int i =0; i < n; i++) {
            ans[i] = arr1[i];
            ans[i+n] = arr1[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}