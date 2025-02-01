package JavaConversion;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) {
        String i = "1";
        String f = "1.2";
        String d = "2.3";
        String b = "5.5";

        int x = Integer.parseInt(i);
        System.out.println(x);
        int y = Integer.valueOf(i);
        System.out.println(y);

        float fx = Float.parseFloat(f);
        System.out.println(fx);

        double dx = Double.parseDouble(d);
        System.out.println(dx);

        BigDecimal bx = new BigDecimal(b);
        System.out.println(bx);

        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        String dateToStr = DateFormat.getInstance().format(currentDate);
        System.out.println("DateFormat.getInstance(): " + dateToStr);

        dateToStr = DateFormat.getDateInstance().format(currentDate);
        System.out.println("DateFormat.getDateInstance(): " + dateToStr);

        dateToStr = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("DateFormat.getTimeInstance(): " + dateToStr);

        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
        System.out.println("DateFormat.getDateTimeInstance(): " + dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
        System.out.println("DateFormat.getTimeInstance(DateFormat.SHORT): " + dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
        System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);

        Date date = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("MM/dd/yyyy = " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("dd-M-yyyy hh:mm:ss = " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("dd MMMM yyyy = " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("dd MMMM yyyy zzzz = " + strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("E, dd MMM yyyy HH:mm:ss z = " + strDate);

    }
}
