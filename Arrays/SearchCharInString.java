public class SearchCharInString {
    public static void main(String[] args){
        String str = "Ganesh";
        char target ='e';
        for (int i=0 ; i<str.length(); i++){
            if(str.charAt(i)==target){
                System.out.println("Target found at index: " + i);
            }
        }
    }
}