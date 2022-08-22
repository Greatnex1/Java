package CHP_7;

public class Stuff {
    public static void deposit(int money){
        money *=  10;
        System.out.println("my money is now " + money);
    }
    public static void withdraw(int check, int balance){
      int  amount = check - balance;
        deposit(balance);
        if(check <= 100){
            System.out.println("Insufficient funds");
        }
        System.out.println("Your balance is " + amount);
    }
}
