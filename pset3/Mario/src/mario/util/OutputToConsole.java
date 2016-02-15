package mario.util;
import mario.OutputType;
public class OutputToConsole implements OutputType
{
    public void outputPyramidBlocks(Pyramid pyramid)
    {
        System.out.print(pyramid.toString());
    }
}
