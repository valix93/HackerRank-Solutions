/* 
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers. 
 */ 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        int size = arr.length;
        int minSum = -1; 
        int maxSum = 0;
        for (int i = 0; i<size ; i++){
            int sum = 0;
            for (int j=0; j<size;j++){
                if (arr[j]!=arr[i]){
                    sum += arr[j]; 
                }
            }
            if (minSum==-1 || minSum>sum){
                minSum = sum;
            }
            if (maxSum<sum){
                maxSum = sum;
            }
        }

        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);
        scanner.close();

    }
}
