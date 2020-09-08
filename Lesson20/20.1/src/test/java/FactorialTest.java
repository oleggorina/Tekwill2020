import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private final Factorial factorial = new Factorial();

    @Test
    public void testNegativeCase(){
        Assert.assertEquals(-1, factorial.get(-1));
    }
    @Test
    public void testGetCase0(){
        Assert.assertEquals(1, factorial.get(0));
    }
    @Test
    public void testGetCase1(){
        Assert.assertEquals(1, factorial.get(1));
    }
    @Test
    public void testGetCase2(){
        Assert.assertEquals(2, factorial.get(2));
    }
    @Test
    public void testGetCase5(){
        Assert.assertEquals(120, factorial.get(5));
    }
}