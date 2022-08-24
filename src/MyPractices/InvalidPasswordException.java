package MyPractices;

public class InvalidPasswordException extends Exception{
    int passwordConditionViolation = 0;

    public InvalidPasswordException(int conditionViolated) {
        super("Invalid Password, \nTry Again!");
        passwordConditionViolation = conditionViolated;
    }
    public String printMessage(){
        return switch (passwordConditionViolation) {
            case 1 -> ("Password length should be " +
                    " between 8 to 15 characters");
            case 2 -> ("Password should not contain any space");
            case 3 -> ("Password should contain at least one digit(0-9)");
            case 4 -> ("Password should contain at least one special character");
            case 5 -> ("Password should contain at least one uppercase letter(A-Z)");
            case 6 -> ("Password should contain at least one lowercase letter(a-z)");
            default -> ("");
        };
    }
}
