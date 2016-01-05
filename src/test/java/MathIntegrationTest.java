import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.simplesciences.MathHelper;

public class MathIntegrationTest {

    @Test
    public void AddTest()
    {
        MathHelper mc1=new MathHelper();
        assertEquals(mc1.add(4,5),9);
        assertEquals(mc1.add(0,5),5);
        assertEquals(mc1.add(100,100),200);

    }

    @Test
    public void AddNegativeNumbersTest()
    {
        MathHelper mc2=new MathHelper();
        assertEquals(mc2.add(-4,5),1);
        assertEquals(mc2.add(0,-5),-5);
    }

    @Test
    public void AddNZeroesTest()
    {
        MathHelper mc3=new MathHelper();
        assertEquals(mc3.add(-4,0),-4);
        assertEquals(mc3.add(0,-15),-15);
    }

    @Test
    public void AddFloatTest()
    {
        MathHelper mc3=new MathHelper();
        assertEquals(mc3.add(1.5,2.3),3.8,0.01);
        assertEquals(mc3.add(2.25,-1.35),0.90,0.01);
    }
}
