public class Swapalternate {

    public static void swapAlternate(int arr[]) {
        //Your code goes here
        int n = arr.length;
        int i ;

        for (i=0 ; i <n ; i+=2) {
            if(i==arr.length-1&&i%2==0) {
                break;
            }
            int k = arr[i];
            arr[i]  = arr[i + 1];
            arr[i+1]= k;


        }
    }
}
