package com.launchcode.greedy;

import com.launchcode.greedy.CoinFactory;

public class Greedy {


    public static void main(String[] varArgs)
    {
        if(varArgs.length > 1)
        {
            CoinFactory coinFactory = new CoinFactory();
            coinFactory.setCurrency(varArgs[0]);
            int coinCount = coinFactory.countCoins(varArgs[0]);
            System.out.print(coinCount);
        }
        throw new IllegalArgumentException("No value given");

    }

}
