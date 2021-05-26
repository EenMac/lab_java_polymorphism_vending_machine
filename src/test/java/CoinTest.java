import coin.Coin;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    private Coin coin;

    @Before
    public void before(){
        coin = new Coin(CoinType.TENP);
    }

    @Test
    public void hasValue(){
        assertEquals(0.1, coin.getValue(), 0);
    }
}
