package MyPractices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public  static boolean isValidUserName(String username){
        String regex = "^[A-Z]\\w{5,29}$";
//        Where:
//“^” represents that starting character of the string.
//“[A-Za-z]” makes sure that the starting character is in the lowercase or uppercase alphabet.
//“\\w{5, 29}” represents a check to make sure that the remaining items are word items, which includes the underscore,
//   until it reaches the end and that is represented with $.
// The “{5, 29}” represents the 6-30 character constraint given to us minus the predefined first character.

        Pattern pattern = Pattern.compile(regex);

        if (username == null){
            return false;
        }
        Matcher match = pattern.matcher(username);
        return match.matches();
    }

    public static void main(String[] args) {
        String s1 = "WelcomeBack";
        System.out.println(isValidUserName(s1));

        String s3 = "1Welcome";
        System.out.println(isValidUserName(s3));

        String s2 = "We";
        System.out.println(isValidUserName(s2));

     String s4 = "WeBe";
        System.out.println(isValidUserName(s4));
        String s5= "WEB";
        System.out.println(isValidUserName(s5));

        String s6 = "WakeBack";
        System.out.println(isValidUserName(s6));

    }
}
