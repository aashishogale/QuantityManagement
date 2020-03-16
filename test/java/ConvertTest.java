import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

    @Test
    public void checkUnit()  {
        Assert.assertTrue(new Quantity(Quantity.unit.Inches, 0).equals(new Quantity(Quantity.unit.Inches,0)));
    }

    @Test
    public void checkForDifferentUnit()  {
        Assert.assertTrue(new Quantity(Quantity.unit.Yards, 1).equals(new Quantity(Quantity.unit.Inches,36)));
    }
}
