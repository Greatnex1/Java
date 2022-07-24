package MyPractices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    Stock reads;
    @BeforeEach
    void up(){
        reads = new Stock("XAU");
    }
 @Test
    void testStockCanBeCreatedC(){
        assertNotNull(reads);

 }
 @Test
    void testStockProfitCanBeCalculated(){
        int costPrice;
      reads.getProfit(20);

//        assertEquals(0.0, reads.getProfit(90));


 }

}