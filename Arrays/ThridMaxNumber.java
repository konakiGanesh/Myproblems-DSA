public class ThridMaxNumber {
    public static void main(String[] args){
        int arr[] = {3,4,2,1,5};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for ( int num : arr){
            if(num > max1){
                max3 = max2;
                max2=max1;
                max1=num;
            } else if(num > max2 && num !=max1){
                max3 = max2;
                max2=num;
            }else if(num > max3 && num!=max2 && num!=max1){
                max3=num;
            }else if(max3 == Integer.MIN_VALUE){
                System.out.println("Third maximum number does not exist.");
            }else{
                System.out.println("Third maximum number is: " + max3);
            }
        }
        System.out.println("Third maximum number is: " + max3);
    }
}
