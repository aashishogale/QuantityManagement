import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

    @Test
    public void convertToInches()  {
        Assert.assertTrue(new Quantity(Quantity.unit.Inches, 0).equals(new Quantity(Quantity.unit.Inches,0)));
    }

}
