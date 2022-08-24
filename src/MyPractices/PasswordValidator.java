package MyPractices;


public class PasswordValidator {
//     Programs that accesses passwords with unique characters
    public static void isValidPassword(String password) throws InvalidPasswordException{
        if(!((password.length()>=8)&&(password.length()<=15))){
            throw new InvalidPasswordException(1);
        }
        if(password.contains(" ")){
            throw new InvalidPasswordException(2);
        }
        {
            int count =  0;
            for (int i = 0; i <=9 ; i++) {
                String str1 = Integer.toString(i);
                if (password.contains(str1)) {
                    count = 1;

                    break;
                }
            }
            if(count == 0){
                throw new InvalidPasswordException(3);
            }
        }
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            throw new InvalidPasswordException(4);
        }
        {
            int count = 0;
            for (int i = 65; i <=90 ; i++) {
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;

                    break;
                }
            }
            if(count == 0)
            {
                throw new InvalidPasswordException(5);
            }
        }
        int count = 0;
        for (int i = 90; i <122 ; i++) {
            char c = (char)i;
            String str1 = Character.toString(c);

            if (password.contains(str1)) {
                count = 1;

                break;
            }
        }
        if(count == 0)
        {
            throw new InvalidPasswordException(6);
        }

    }

    public static void main(String[] args) {
        String pass = "JavaIsFun";

        try{
            System.out.println("Is Password " + pass + " valid?");
            isValidPassword(pass);
            System.out.println("Valid password!");

        }
        catch (InvalidPasswordException err){
            System.out.println(err.getMessage());
            System.out.println(err.printMessage());
        }
        String pass1 = "Java002@FUN";
        try{
            System.out.println("\n Is Password " + pass1 + " valid?" );
            isValidPassword(pass1);
            System.out.println("Valid Password!");
        }
        catch(InvalidPasswordException e){
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
        }
        String pass2 = "what if";
        try{
            System.out.println("\n is Password " + pass2 + " valid?");
            isValidPassword(pass2);
            System.out.println("Valid Password");
        }
        catch(InvalidPasswordException error){
            System.out.println(error.getMessage());
            System.out.println(error.printMessage());
        }
    }
}
