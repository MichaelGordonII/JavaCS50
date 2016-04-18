package com.launchcode.greedy.currency;

import com.launchcode.greedy.CurrencyFactory;

public class EUCurrency implements CurrencyFactory
{
    private final int Coins[] = {200,100,50,20,10,5,2,1};
    public int[] getCoinValues()
    {
        return(Coins);
    }
}

