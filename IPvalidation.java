import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IPvalidation {
    static final String NEITHER = "NEITHER";
    static final String IPv4 = "IPv4";
    static final String IPv6 = "IPv6";

    static String IPvalidation(String str) {
        String delimsPeriod = ".";
        String delimsColon = ":";

        // checking IPv4

        int counter = 0;
        boolean working = true;
        StringTokenizer st = new StringTokenizer(str, delimsPeriod);
        while(st.hasMoreElements()) {
            String elem = (String)st.nextElement();
            System.out.println(elem);
            try{
                System.out.println("First try block");
                new Long(elem);
            } catch(Exception e) {
                try{
                    System.out.println("Second try block");
                    Long.parseLong(elem, 8);
                } catch(Exception e2) {
                    try{
                        System.out.println("Third try block");
                        Long.parseLong(elem, 16);
                    } catch(Exception e3) {
                        try{
                            System.out.println("Third try block");
                            Long.parseUnsignedLong(elem, 8);
                        } catch(Exception e4) {
                            try{
                                System.out.println("Third try block");
                                Long.parseUnsignedLong(elem, 16);
                            } catch(Exception e5) {
                                working = false;
                                break;
                            }
                        }
                    }
                }
            }
            counter++;
        }
        System.out.println(counter);

        if(working && (counter == 4)) {
            return IPv4;
        }

        // checking IPv6
        int counterv6 = 0;
        boolean workingv6 = true;
        StringTokenizer stv6 = new StringTokenizer(str, delimsColon);
        while(stv6.hasMoreElements()) {
            String elem = (String)stv6.nextElement();
            try{
                Long.parseLong(elem, 16);
            } catch(Exception e) {
                workingv6 = false;
                break;
            }
            counterv6++;
        }
        if(workingv6 && (counterv6 == 8)) {
            return IPv6;
        }

        // NEITHER
        return NEITHER;
    }

    public static void testCase2(Scanner in2) {
        int T = in2.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for(int j = 0; j <= T; j++) {
            arr.add(in2.nextLine());
        }

        for(int i = 1; i < arr.size(); i++) {
            System.out.println( IPvalidation(arr.get(i)));
        }
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        /*
        int T = in.nextInt();
        String[] arr = new String[T+1];
        for(int j = 0; j <= T; j++) {
            arr[j] = in.nextLine();
        }
        for(int i = 1; i < arr.length; i++) {
            System.out.println( IPvalidation(arr[i]));
        }
        */
        testCase2(in);

    }
}
