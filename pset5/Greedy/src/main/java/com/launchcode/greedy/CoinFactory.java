package com.launchcode.greedy;

import com.launchcode.greedy.currency.EUCurrency;
import com.launchcode.greedy.currency.USCurrency;

public class CoinFactory
{
    private static CurrencyFactory currency = null;
    private static String changeString;
    public CurrencyFactory determainCurrencyTypeFromString(String change)
    {
        if(change.charAt(0) == '€')
        {
            return(new EUCurrency());
        }
        else if(change.charAt(0) == '$')
        {
            return(new USCurrency());
        }
        else
        {
            return(null);
        }
    }
    public void setCurrencyFactory(CurrencyFactory currencyFactory)
    {
        this.currency = currencyFactory;
    }
    public void setChangeString(String value)
    {
        this.changeString = value;
    }
    public double convertChangeStringToDouble(String amountOfChange)
    {
        return(Double.parseDouble(amountOfChange.substring(1)));
    }
    public int convertDoubleToChangeValue(double value)
    {
        return ((int) (value * 100));
    }
    public int countCoins()
    {
        int changeValue = convertDoubleToChangeValue(convertChangeStringToDouble(this.changeString));
        return(countCoinsInChange(currency.getCoinValues(),changeValue));
    }
    public int countCoinsInChange(int[] coinValues, int change)
    {
        int coinCount = 0;
        for(int coinIndex = 0; coinIndex < coinValues.length; coinIndex++)
        {
            while(change >= coinValues[coinIndex])
            {
                change -= coinValues[coinIndex];
                coinCount++;
            }
        }
        return(coinCount);
    }
}
