package CHP_5;

import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        String prompt = """
                1 for English
                2 for Yoruba
                """;
//String userResponse= keyInput.nextLine();
// char response = userResponse.charAt(0);
        //   switch( userResponse.charAt(0)){
        int userResponse = keyInput.nextInt();;
        switch (userResponse) {
            case 1 -> System.out.println("data");
            case 2 -> System.out.println("transfer");
            default -> System.out.println("OUT");
        }
        int uResponse = keyInput.nextInt();
        switch (uResponse) {
            case 1 -> System.out.println("Sharing");
            case 2 -> System.out.println("Caring");

        }
    }

}
