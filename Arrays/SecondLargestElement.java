public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {2,3,45,63,6};
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>large){
                secondLarge = large;
                large = num;
            }if( num > secondLarge && num != large){
                secondLarge = num;
            }
        }
        System.out.println(" the largest element is: " +large);
        System.out.println(" the second largest element is: " +secondLarge);
    }
}
