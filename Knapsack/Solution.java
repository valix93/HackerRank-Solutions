import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int n = input.nextInt();
            int k = input.nextInt();

            boolean[] sack = getBooleans(input, n, k);
            print(sack);
        }
    }

    private static boolean[] getBooleans(Scanner input, int n, int k) {
        int[] weights = new int[n];
        boolean[] sack = new boolean[k+1];
        for(int j=0; j<n; j++){
            weights[j] = input.nextInt();
            if(weights[j] < k+1)sack[weights[j]] = true;
        }

        for(int j=0; j<k+1; j++){
            for(int p=0; p<n; p++){
                if(sack[j])break;
                if(j - weights[p] > 0 && sack[j - weights[p]]){
                    sack[j] = true;
                }
            }
        }
        return sack;
    }

    public static void print(boolean[] sack){
        for(int i=sack.length-1; i>=0; i--){
            if(sack[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
