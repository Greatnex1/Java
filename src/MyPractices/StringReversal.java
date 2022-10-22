package MyPractices;

import java.util.Scanner;

public class StringReversal {
    //using Recursion

        String reverse(String s)
        {
            if(s.length() == 0)
                return " ";
            return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
        }
        public static void main(String[ ] arg)
        {
            StringReversal rev = new StringReversal();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string : ");
            String  str = scanner.nextLine();
            System.out.println("Reverse of a String  : "+rev.reverse(str));
        }
    }

