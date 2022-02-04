import static org.junit.Assert.*;
import org.junit.*;

public class skillDemTest {
    @Test
    public void testExponent() {
        skillDem s1 = new skillDem();
        assertEquals(s1.square_exponent(3), 4); // Should fail
    }

}
