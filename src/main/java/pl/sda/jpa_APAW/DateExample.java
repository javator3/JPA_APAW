package pl.sda.jpa_APAW;

import java.util.Calendar;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        System.out.println("currentDate = " + currentDate);
    }
}
