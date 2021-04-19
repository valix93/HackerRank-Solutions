/*
Java String Reverse
Given a string , print Yes if it is a palindrome, print No otherwise.
*/
import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = new StringBuilder(A).reverse().toString();
        String result = "No";
        if (A.equals(B)){
            result = "Yes";
        }
        System.out.println(result);
    }
}
