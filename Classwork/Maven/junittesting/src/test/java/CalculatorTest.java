import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.Calculator;

public class CalculatorTest {
    @Test
    public void TestCalc(){
        Calculator c = new Calculator();
        System.out.println("This is Testing the Calculator.");
        int expRes1=30;
        int actRes1=c.add(10,20);
        assertEquals(expRes1,actRes1);

        int expRes2=10;
        int actRes2=c.sub(20,10);
        assertEquals(expRes2,actRes2);

        int expRes3=200;
        int actRes3=c.mul(20,10);
        assertEquals(expRes3,actRes3);

        int expRes4=1;
        int actRes4=c.div(2,2);
        assertEquals(expRes4,actRes4);

    }
}
