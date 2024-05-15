import org.example.Recursion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    Recursion recursion = new Recursion();
    @Test
    public void testAddition() {
        assertEquals(2, recursion.test(1,1));
    }
}
