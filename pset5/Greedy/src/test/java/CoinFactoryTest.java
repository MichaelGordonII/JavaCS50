import com.launchcode.greedy.CoinFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinFactoryTest
{
    @Test
    public void stringThreePointTwentyFiveConvertsToThreeHundredTwentyFive()
    {
        CoinFactory coinFactory = new CoinFactory();
        int changeValue = coinFactory.convertDoubleToChangeValue(coinFactory.convertChangeStringToDouble("$3.25"));
        assertEquals(325, changeValue);
    }
    @Test
    public void OneEUDollarEqualsOneCoin()
    {
        String oneDollar = "€1.00";
        CoinFactory coinFactory = new CoinFactory();
        coinFactory.setCurrency(oneDollar);
        int coinCount = coinFactory.countCoins(oneDollar);
        assertEquals(1,coinCount);
    }
    @Test
    public void TwoEUDollarsEqualsOneCoin()
    {
        String twoDollar = "€2.00";
        CoinFactory coinFactory = new CoinFactory();
        coinFactory.setCurrency(twoDollar);
        int coinCount = coinFactory.countCoins(twoDollar);
        assertEquals(1,coinCount);
    }

}
