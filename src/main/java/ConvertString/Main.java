package ConvertString;
import java.util.* ;
import java.io.*;

public class Main {
    public class Solution{
        public static String convertString(String str) {

            StringBuilder sb = new StringBuilder(str);

            boolean flag = true;
            for (int i = 0; i < sb.length(); i++) {
                if (flag == true && Character.isLowerCase(sb.charAt(i))) {
                    sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                }
                if (Character.isSpaceChar(sb.charAt(i))) {
                    flag = true;
                } else {
                    flag = false;
                }
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // ? Corrected Scanner initialization
            int n = sc.nextInt(); // ? Read integer input

            for (int i = 0; i < n; i++) {
                String input = sc.nextLine(); // ? Read full line of input
                String output = convertString(input);
                System.out.println(output);
            }

            sc.close();
        }
    }
}
