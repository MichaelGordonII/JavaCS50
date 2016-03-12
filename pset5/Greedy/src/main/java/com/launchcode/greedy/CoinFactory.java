package com.launchcode.greedy;

import com.launchcode.greedy.currency.EUCurrency;
import com.launchcode.greedy.currency.USCurrency;

public class CoinFactory
{
    private static CurrencyFactory currency = null;
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
    public double convertChangeStringToDouble(String amountOfChange)
    {
        return(Double.parseDouble(amountOfChange.substring(1)));
    }
    public int convertDoubleToChangeValue(double value)
    {
        return ((int) (value * 100));
    }
    public CurrencyFactory setCurrency(String change)
    {
        if(currency == null)
        {
            currency = determainCurrencyTypeFromString(change);
        }
        return(currency);
    }
    public int countCoins(String change)
    {
        int changeValue = convertDoubleToChangeValue(convertChangeStringToDouble(change));
        return(currency.countCoinsInChange(changeValue));
    }
}
