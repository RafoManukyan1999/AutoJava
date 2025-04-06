import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber() {
        assertEquals(14, getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        assertTrue("the number is not greater than 45. ", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        String actual = getClassString();
        boolean containsHello = actual.contains("Hello") || actual.contains("hello");
        assertTrue("the string does not contain 'Hello' or 'hello'. " + actual, containsHello);
    }

}