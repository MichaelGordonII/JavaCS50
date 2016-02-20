package com.launchcode.mario.util;

public class PyramidFactory
{
    private PyramidFactory()
    {

    }
    private static PyramidFactory pyramidFactory;
    public static PyramidFactory getInstance()
    {
        if(pyramidFactory == null)
        {
            pyramidFactory = new PyramidFactory();
        }
        return(pyramidFactory);
    }
    public Pyramid newPyramid(int height)
    {
        return new Pyramid(height);
    }
}
