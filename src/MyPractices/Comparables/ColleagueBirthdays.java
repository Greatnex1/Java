package MyPractices.Comparables;

import java.util.ArrayList;
import java.util.Collections;

public class ColleagueBirthdays {
    public static void main(String[] args) {


        ArrayList<CalenderDate> colleagueBirthday = new ArrayList<>();
        colleagueBirthday.add(new CalenderDate("Samuel",2, 22));
        colleagueBirthday.add(new CalenderDate("Noah",1, 4));
        colleagueBirthday.add(new CalenderDate("Joan",6, 9));
        colleagueBirthday.add(new CalenderDate("Lydia",7, 10));
        colleagueBirthday.add(new CalenderDate("Rotimi",2, 21));


        Collections.sort(colleagueBirthday);
        System.out.println("A list of my colleague birthdays" + colleagueBirthday);
    }
}
