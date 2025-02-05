package International;

import java.text.NumberFormat;
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
    }
}
