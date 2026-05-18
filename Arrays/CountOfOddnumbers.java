public class CountOfOddnumbers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,812,435,34,2,4};
        int countodd =0;
        int counteven =0;
        int countpositive =0;int countnegative =0;
        int countzero =0;
        for(int num : arr) {
            if(num %2!=0) {
                countodd++;
            }else{
                counteven++;
            }if(num > 0) {
                countpositive++;
            }if(num < 0) {
                countnegative++;
            }if(num ==0) {
                countzero++;
            }
        }
        System.out.println("Count of odd numbers: " + countodd);
        System.out.println("Count of even numbers: " + counteven);
        System.out.println("Count of positive numbers: " + countpositive);
        System.out.println("Count of negative numbers: " + countnegative);
        System.out.println("Count of zero numbers: " + countzero);
    }
}