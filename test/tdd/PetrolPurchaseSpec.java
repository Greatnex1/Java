package tdd;

import ExcerciseThree.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseSpec {
    PetrolPurchase test;

    @BeforeEach
    void fuel(){
        test = new PetrolPurchase("Akoka","diesel", 3, 30.0, 50.0);
    }
    @Test
    public void testQuantity(){
        test.setQuantity(3);
        int quantity = test.getQuantity();
        assertEquals(3, quantity );

    }
    @Test
    public void testPrice(){
        test.setPrice(30.0);
        double price = test.getPrice();
        assertEquals(30.0,price);
    }
}
