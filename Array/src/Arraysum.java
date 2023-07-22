public class Arraysum {

    public static int sum(int[] arr) {
        //Your code goes here
        // int n=arr.length;
        // int i,s=0;
        // for(i=0;i<n;i++)
        //     s=s+arr[i];
        // return s;


        int sum = 0;
        for (int i=0 ; i < arr.length ; i++){
            sum = sum + arr[i] ;

        }
        return sum;
    }
}
