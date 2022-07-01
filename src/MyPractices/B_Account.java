package MyPractices;

public class B_Account {

    private int balance;
    private String pin;

    public B_Account(int number, String name, String pin) {
        this.pin = pin;
    }

    public int getAccountNumber(int number) {
        return number;
    }

    public String getAccountName(String name) {
        return name;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        int newBalance;
        if (this.pin.equals(pin)) newBalance = balance;
        else newBalance = 0;


        return newBalance;

//    }
//public B_Account(int amount , String pin) {
//      //  if(this.pin.equals(pin)) ;
//this.pin = pin;
//    }

    }

    public void withdraw(int amount, String pin) {
        balance -= amount;
    }

}

