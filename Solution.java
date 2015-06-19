import java.io.*;
import java.util.*;

public class Solution {

    static final String ADD_OP = "add";
    static final String MULT_OP = "mult";
    static final String LET_OP = "let";
    static final String BEGIN_QUOTE ="(";
    static final String END_QUOTE = ")";
    static Stack theStack = new Stack();

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static String miniLisp(String s) {
        int var, var2;
        String oper = "";

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                builder.append("( ");
            }
            else if(s.charAt(i) == ')') {
                builder.append(" )");
            }
            else
                builder.append(s.charAt(i));
        }

        String newStr = builder.toString();

        StringTokenizer strToken = new StringTokenizer(newStr);
        while(strToken.hasMoreTokens()) {
            String key = strToken.nextToken();
            if(key.equals(END_QUOTE)) {
                var = Integer.parseInt((String)theStack.pop());
                var2 = Integer.parseInt((String)theStack.pop());
                oper = (String)theStack.pop();
                theStack.pop();    // popping out beginning quote

                if(oper.equals(ADD_OP)) {
                    int num = add(var, var2);
                    String number = num + "";
                    theStack.push(number);
                }
                else if (oper.equals(MULT_OP)) {
                    int num2 = mult(var, var2);
                    String number2 = num2 + "";
                    theStack.push(number2);
                }
            }
            else {
                theStack.push(key);
            }
        }
        return (String)theStack.pop();
    }

    public static void main(String args[] ) throws Exception {
        Solution sol = new Solution();
        Scanner in = new Scanner(System.in);
        String s = "";

        while(in.hasNext()) {
            s = in.nextLine();
            System.out.println(miniLisp(s));
        }
    }
}