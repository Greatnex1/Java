package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
        Account account = new Account();

        assertEquals(0, account.getBalance());

        int balance = account.getBalance();

        assertEquals(0, balance);

    }

    @Test
    public void depositMoneyTest() {

        Account noahAccount = new Account();
        noahAccount.deposit(1_500);
        assertEquals(1500, noahAccount.getBalance());

    }

    @Test
    public void depositTwiceTest() {
        Account niceAccount = new Account();
        niceAccount.deposit(1_500);
        niceAccount.deposit(2_000);
        assertEquals(3_500, niceAccount.getBalance());

    }

    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegtiveAmountTest() {
        Account wellAccount = new Account();
        wellAccount.deposit(-1_000);
        assertEquals(-1_000, wellAccount.getBalance());
    }


    @Test
    public void withdrawMoneyTest() {
        Account justAccount = new Account();
        justAccount.deposit(4_000);
        justAccount.withdraw(2_000);
        assertEquals(2_000, justAccount.getBalance());


    }

    @Test
    public void withdrawTwiceTest() {

        Account viewAccount = new Account();
        viewAccount.deposit(5_000);
        viewAccount.withdraw(6_000);
        assertEquals(5_000, viewAccount.getBalance());
    }


    @Test
    @DisplayName("Withdraw amount should not change balance test to negative")
    public void withdrawNegativeTest(){

        Account negativeAccount = new Account();
        negativeAccount.deposit(3_000);
        negativeAccount.withdraw(-3_500);
        assertEquals(3_000, negativeAccount.getBalance());
    }
}