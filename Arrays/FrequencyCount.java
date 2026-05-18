public class FrequencyCount {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,1,2,3,4,5};
        int n = arr.length;
        for( int i=0; i<n; i++){
            int count = 1; 
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println("Element " + arr[i] + " occurs " + count + " times");
        }
    }
}