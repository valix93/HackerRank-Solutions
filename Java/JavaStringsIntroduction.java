import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if (A.length()>0){
            char ch = Character.toUpperCase(A.charAt(0)); 
            String tmp = A;
            A = ch + tmp.substring(1,A.length());
        }
        if (B.length()>0){
            char ch = Character.toUpperCase(B.charAt(0)); 
            String tmp = B;
            B = ch + tmp.substring(1,B.length());
        }
        System.out.println(A + " " + B);
        
    }
}
