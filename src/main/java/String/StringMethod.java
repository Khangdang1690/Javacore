package String;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "Welcome to me";
        System.out.println(s1.charAt(9));

        System.out.println("Length" + s1.length());

        // String s2 = s1 + ", I am 18 years old";
        String name = "Messi";
        int age = 37;
        String s2 = String.format("Hello, my name is %s, I am %d years old.", name, age);
        System.out.println(s2);

        String substring = s2.substring(1,5);
        String substring2 = s2.substring(6);
        System.out.println(substring2);

        if (s2.contains("Messi")) {
            System.out.println("Hello, Messi");
        } else {
            System.out.println("Goodbye, Messi");
        }

        String s3 = String.join("-", "A", "B", "C", "D", "E", "F");
        System.out.println(s3);

        if (s1.equals(s2)) {
            System.out.println("Hello Me");
        } else {
            System.out.println("Bye");
        }

        String a = "Hello";
        String b = "hello";
        if (a.equalsIgnoreCase(b)) {
            System.out.println("similar");
        } else {
            System.out.println("not similar");
        }

        String email = "";
        if (email.isEmpty()) {
            System.out.println("Email is empty");
        } else {
            System.out.println("Email is " + email);
        }

        String email1 = "    a    ";
        if (email1.trim().isEmpty()) {
            System.out.println("Email is empty");
        } else {
            System.out.println("Email is " + email1.trim());
        }

        String s5 = s1.concat(s2);
        System.out.println(s5);

        String s6 = s5.replace("37", "18");
        System.out.println(s6);

        String[] split = s6.split(",");
        for (String s: split) {
            System.out.println(s);
        }

        String intern = s1.intern();
        System.out.println(intern);

        System.out.println(intern.indexOf("m"));

        System.out.println(intern.toLowerCase());
        System.out.println(intern.toUpperCase());

        float pi = 3.14f;
        String s8 = String.valueOf(pi);

        StringBuilder builder = new StringBuilder("Hello");
        builder.append(", ");
        builder.append("Khang");
        System.out.println(builder.toString());

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("Khang");
        System.out.println(sb.toString());


    }
}
