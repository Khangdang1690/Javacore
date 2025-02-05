package International;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Print the country and display country of the default locale
        Locale defaultLocale = Locale.getDefault();

        System.out.println("getCountry(): " + defaultLocale.getCountry());
        System.out.println("getDisplayCountry(): " + defaultLocale.getDisplayCountry());
        System.out.println();

        // Print the language and display language of the default locale
        System.out.println("getLanguage(): " + defaultLocale.getLanguage());
        System.out.println("getDisplayLanguage(): " + defaultLocale.getDisplayLanguage());
        System.out.println();

        // Print the ISO language code and country code
        System.out.println("ISO Language: " + defaultLocale.getISO3Language());
        System.out.println("ISO Country: " + defaultLocale.getISO3Country());

        Locale vnLocale = new Locale("vi", "VN");
        Locale chinaLocale = Locale.CHINA;
        Locale japanLocale = Locale.JAPAN;
        Locale geLocale = Locale.GERMANY;

        System.out.println("getDisplayLanguage(): " + vnLocale.getDisplayLanguage());
        System.out.println("getDisplayLanguage(): " + japanLocale.getDisplayLanguage());
        System.out.println("getDisplayLanguage(): " + chinaLocale.getDisplayLanguage());

        NumberFormat vnFormat = NumberFormat.getCurrencyInstance(vnLocale);
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat jpFormat = NumberFormat.getCurrencyInstance(japanLocale);
        NumberFormat geFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);

        double currency = 3367812d;
        System.out.println(vnFormat.format(currency));
        System.out.println(jpFormat.format(currency));
        System.out.println(geFormat.format(currency));

        System.out.println("----- [ DateFormat ] -----");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, vnLocale);
        System.out.println(dateFormat.format(new Date()));

        System.out.println("----- [ Date ] -----");

        DateFormat vnTimeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, vnLocale);
        System.out.println(vnTimeFormat.format(new Date()));
        DateFormat jpTimeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, japanLocale);
        System.out.println(jpTimeFormat.format(new Date()));
        DateFormat geTimeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, geLocale);
        System.out.println(geTimeFormat.format(new Date()));
        DateFormat usTimeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, defaultLocale);
        System.out.println(usTimeFormat.format(new Date()));

        TestSay testSay = new TestSay();
        testSay.say("welcome");
        TestSay2 testSay2 = new TestSay2();
        testSay2.say("Aloha usa");

        TestSay3 testSay3 = new TestSay3();
        testSay3.say("do something");
        testSay3.doit();
    }
}
