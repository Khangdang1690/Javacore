package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // Method 1
        Pattern pattern = Pattern.compile("Ta.");
        Matcher matcher = pattern.matcher("Tay");
        System.out.println(matcher.matches());

        // Method 2
        boolean result = Pattern.compile("Ta.").matcher("Tay").matches();
        System.out.println(result);

        // Method 3
        boolean matches = Pattern.matches("Ta.", "Tay");
        System.out.println(matches);

//        Pattern pattern1 = Pattern.compile("[a-z]");
//        Matcher matcher1 = pattern1.matcher("a");
//        System.out.println(matcher.matches());

        Pattern pattern1 = Pattern.compile("^[a-z0-9]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher1 = pattern1.matcher("tayjava@email.com");
        System.out.println(matcher1.matches());
    }

//    public static void main(String[] args) {
//        String[] searchConditions = {"username:Tay", "gender:male", "city:Hanoi", "sort:asc"};
//        for (String condition : searchConditions) {
//            Pattern pattern = Pattern.compile("(\\w+?)(:)(.*)");
//            Matcher matcher = pattern.matcher(condition);
//            if (matcher.find()) {
//                System.out.println("condition = " + condition);
//                if (matcher.group(1).equalsIgnoreCase("sort")) {
//                    System.out.println("sort by " + matcher.group(3).toUpperCase());
//                }
//            }
//        }
//    }
}
