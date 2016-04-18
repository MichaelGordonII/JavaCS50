package com.launchcode.greedy.currency;

import com.launchcode.greedy.CurrencyFactory;

public class USCurrency implements CurrencyFactory
{
    private final int[] Coins = {100,25,10,5,1};
    public int[] getCoinValues()
    {
        return(Coins);
    }
}
