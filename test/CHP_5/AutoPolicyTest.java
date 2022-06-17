package CHP_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoPolicyTest {
    static AutoPolicyMethod test;

    @BeforeEach
    void up() {
        test = new AutoPolicyMethod(56789043, "Fun", "Original");
    }

    @Test
    public void testAccountNumberCanBeCreated() {
        test.setAccountNumber(56789043);
        assertEquals(56789043, test.getAccountNumber());
    }

    @Test
    public void testMakeAndModel() {
        test.setMakeAndModel("Fun");
        assertEquals("Fun", test.getMakeAndModel());
    }

    @Test
    public void testStateHasNoFault(){
       boolean result = test.isNoFaultState();
        assertFalse(result);

    }
}


