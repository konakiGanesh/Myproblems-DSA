
public class Sum_of_array_elements{
    public static void main(String [] args){
        int arr[] = {3,5,6,8,9};
        int sum=0;
        int evSum=0;
        for(int num : arr){
            sum += num;
            if(num % 2==0){
                evSum += num;
            }
        }
        float avg = (float)sum / arr.length;
        
        System.out.println("sum of the elements in the array :" + sum);
        System.out.println("average of the elements in the array :" + avg);
        System.out.println("sum of even elements in the array :" + evSum);
    }
}