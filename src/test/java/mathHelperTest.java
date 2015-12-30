

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.simplesciences.MathHelper;

public class mathHelperTest {
    @Test
    public void AddTest()
    {
        MathHelper mc=new MathHelper();
        assertEquals(mc.add(4,5),8);
        assertEquals(mc.add(0,5),5);
        assertEquals(mc.add(0,0),0);
        assertEquals(mc.add(100,100),200);
    }

    @Test
    public void AddNegativeNumbersTest()
    {
        MathHelper mc=new MathHelper();
        assertEquals(mc.add(-4,5),1);
        assertEquals(mc.add(0,-5),-5);
        assertEquals(mc.add(-1,-2),-3);
        assertEquals(mc.add(-1,1),0);
    }
}
