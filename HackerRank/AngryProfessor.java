package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    static final String YES = "YES";
    static final String NO = "NO";

    static String angryProfessor(int num, int wants, ArrayList<Integer> arr) {
        int counter = 0;
        for(int i = 0; i < num; i++) {
            if(arr.get(i) <= 0) {
                counter++;
            }
        }
        System.out.println(counter);
        if(counter <= wants) {
            return YES;
        } else {
            return NO;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N,K;
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i < T; i++) {
            N = in.nextInt();
            K = in.nextInt();
            for (int j = 0; j < N; j++) {
                num.add(in.nextInt());
            }
            System.out.println(angryProfessor(N, K, num));
        }
    }
}