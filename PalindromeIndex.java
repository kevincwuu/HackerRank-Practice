//https://www.hackerrank.com/challenges/palindrome-index

package PalindromeIndex;

import java.io.*;

public class PalindromeIndex {

   public static void main(String[] args) throws IOException {
       StringBuffer sb = new StringBuffer();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       for(byte T = Byte.parseByte(br.readLine()); T > 0; --T) {
           final char[] charArray = br.readLine().toCharArray();
           final int N = charArray.length;
           int output = -1;
           for(int i = 0, j = N-1; i < j; ++i, --j) {
               if(charArray[i] != charArray[j]) {
                   output = isPalindrome(charArray, i+1, j) ? i : j;
               }
           }
           sb.append(output + "\n");
       }
       System.out.print(sb);
   }
   private static boolean isPalindrome(char[] arr, final int num, final int num2) {
       for(int i = num, j = num2; i < j; ++i, --j) {
           if(arr[i] != arr[j]) {
               return false;
           }
       }
       return true;
   }
}