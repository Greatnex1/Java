package MyPractices;
import java.util.Scanner;
public class InteractiveResponse {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 for English:");
        System.out.println("Press 2 for Igbo:");
        System.out.println("Press 3 for French:");
        System.out.println("Press 4 for Yoruba :");

        int userInput =input.nextInt();
        if (userInput <=1 ) {
            System.out.println("1  for  data");
        }
            if (userInput <=2 ){
            System.out.println("2 for transfer");
        }
        else if(userInput==2){
            System.out.println("1  for sharing");
            System.out.println("2 for caring");
        }
        else if(userInput<=3){
            System.out.println("1  for Egg");
            System.out.println("2 for Champaigne");
        }
        else if(userInput==4){
            System.out.println("1  for Ewa");
            System.out.println("2 for Rice");
        }

        System.out.println();

        int uInput =input.nextInt();

        if(uInput <=2 ) {
            System.out.println("1  for sharing");
            System.out.println("2 for caring");
        }
        System.out.println();

        int usInput =input.nextInt();
        if(usInput <=3) {
            System.out.println("1  for Egg");
            System.out.println("2  for Champ");
        }
        System.out.println();

        int useInput =input.nextInt();

         if(useInput <=4 ) {
            System.out.println("1  for data");
             System.out.println("2 for transfer");


        }
      }
    }

