import org.junit.Before;
import org.junit.Test;
import product.Souvenir;

import static org.junit.Assert.assertEquals;

public class SouvenirTest {

    private Souvenir noveltyHat;

    @Before
    public void before() {
        noveltyHat = new Souvenir("See You Jimmy Hat", 5);
    }

    @Test

    public void hasName() {
        assertEquals("See You Jimmy Hat", noveltyHat.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(5, noveltyHat.getPrice(), 0);
    }
}
