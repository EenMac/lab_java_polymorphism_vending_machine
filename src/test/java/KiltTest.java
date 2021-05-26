import org.junit.Before;
import org.junit.Test;
import product.Kilt;
import product.TartanType;

import static org.junit.Assert.assertEquals;

public class KiltTest {

    private Kilt kilt;

    @Before
    public void before(){
        kilt = new Kilt("MacKenzie", 10, TartanType.MACKENZIE);
    }

    @Test
    public void hasName(){
        assertEquals("MacKenzie", kilt.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, kilt.getPrice(), 0);
    }

    @Test
    public void hasColors(){
        assertEquals("red, green", kilt.getTartanType().getColors());
    }
}
