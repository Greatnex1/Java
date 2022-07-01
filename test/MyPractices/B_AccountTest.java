package MyPractices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class B_AccountTest {
    B_Account test;
@BeforeEach
    void set(){
     test = new B_Account(2, "Joe","2345");

    }
    @Test
    public void accountCanBeCreatedTest() {
        int number = test.getAccountNumber(2);
        String name = test.getAccountName("Joe");
        assertEquals("Joe", name);
        assertEquals(2, number);
    }
    @Test
    public void accountCanMakeDeposits(){
    test.deposit(1000);
    test.getBalance();
    assertEquals(1000,test.getBalance());
    }
   @Test
   public  void accountCanMakeWithdraws(){
 test.deposit(1000);
  test.withdraw(800,"2345");
 assertEquals(200, test.getBalance());
  }
    @Test
    public void testAccountHasPin(){
    String pin = "2345";
    assertEquals("2345",pin);
    }
//    @Test
//    public void testWrongPinFails(){
//    int win =test.wrongPin("4567");
//    assertEquals(0,win);
//    }
    }

