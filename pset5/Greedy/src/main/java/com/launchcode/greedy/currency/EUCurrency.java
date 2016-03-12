package com.launchcode.greedy.currency;

import com.launchcode.greedy.CurrencyFactory;

public class EUCurrency implements CurrencyFactory
{
    private final int Coins[] = {200,100,50,20,10,5,2,1};
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

