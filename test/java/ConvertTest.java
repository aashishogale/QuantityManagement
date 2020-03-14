import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

    @Test
    public void convertToInches()  {
        Assert.assertTrue(new Quantity("ft", 0).equals(new Quantity("ft",0)));
    }

}
