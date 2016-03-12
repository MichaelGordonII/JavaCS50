package com.launchcode.greedy.currency;

import com.launchcode.greedy.CurrencyFactory;

public class USCurrency implements CurrencyFactory
{
    private final int Coins[] = {100,25,10,5,1};
    public int countCoinsInChange(int change)
    {
        int coinCount = 0;
        for(int coinIndex = 0; coinIndex < this.Coins.length; coinIndex++)
        {
            while(change >= this.Coins[coinIndex])
            {
                change -= this.Coins[coinIndex];
                coinCount++;
            }
        }
        return(coinCount);
    }
}
