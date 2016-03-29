package com.launchcode.greedy;

import com.launchcode.greedy.CoinFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Greedy {


    public static void main(String[] varArgs)
    {
        if(varArgs.length > 1)
        {
            ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
            Greedy objGreedy = (Greedy) context.getBean("greedy");
            objGreedy.run(varArgs[1]);
        }
        throw new IllegalArgumentException("No value given");

    }
    private CoinFactory coinFactory;
    public void setCoinFactory(CoinFactory coinFactory)
    {
        this.coinFactory = coinFactory;
    }
    public void run(String varArg)
    {
        coinFactory.setCurrency(varArg);
        int coinCount = coinFactory.countCoins(varArg);
        System.out.print(coinCount);
    }
}
