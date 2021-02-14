package challenges;

import java.util.Arrays;

public class MiniMaxSum {
    public void miniMaxSum(int[] arr) {
        long[] sums = sumOfAllExceptOne(arr);
        Arrays.sort(sums);
        System. out. println(sums[0]+ " "+ sums[sums.length - 1]);

    }

    public  long[] sumOfAllExceptOne(int[] arr){

        long[] longArray = Arrays.stream(arr).mapToLong(i -> i).toArray();
        long sum = 0;
        long[] sumArray = new long[arr.length];
        for(int i= 0; i<arr.length ; i++){
            for(int j = 0; j< arr.length ; j++ ){
                if(i==j) continue;
                sum += arr[j];
            }
            sumArray[i] = sum;
            sum = 0;
        }
        return sumArray;
    }
}
