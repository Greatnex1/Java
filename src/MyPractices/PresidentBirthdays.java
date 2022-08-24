package MyPractices;

import java.util.ArrayList;
import java.util.Collections;

public class PresidentBirthdays {
//   A program that creates a list of united-states president birthdays and sorts them in order

    public static void main(String[] args) {
        ArrayList <CalenderDate> dates = new ArrayList<>();
        dates.add(new CalenderDate("Washington",2, 22));
        dates.add(new CalenderDate("Adams",10, 30));
        dates.add(new CalenderDate("Jefferson",4, 13));
        dates.add(new CalenderDate("Madison",3, 16));
        dates.add(new CalenderDate("Monroe",4, 28));
//        System.out.println(dates);
        Collections.sort(dates);
        System.out.println("President Birthdays = " + dates);

    }
}
// Collections.sort allows the dates appear in increasing calendar order