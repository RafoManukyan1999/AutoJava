import com.sun.org.apache.xpath.internal.objects.XNumber;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Before
    public void testBefore() {System.out.println("Test Start");}

    @After
    public void testAfter() {System.out.println("Test End");}

    @Test
    public void testGetMessage(){
        String expected = getMessage();
        Assert.assertTrue("Word is not included ", expected.contains("Hello"));
        System.out.println("Word is included ");
    }
}