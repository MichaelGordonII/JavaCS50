package w.mario.src.output; //full path to source files
import w.mario.src.OutputType;
public class OutputToConsole implements OutputType
{
    public void outputPyramidBlocks(int rows, int columns)
    {
        int blockIndex = 2;
        int spaceIndex = 0;
        for(int rowIndex = 0; rowIndex < rows; rowIndex++)
        {
            spaceIndex = columns - blockIndex;
            for (int spaces = spaceIndex; spaces > 0; spaces--)
            {
                System.out.print(" ");
            }
            for (int block = blockIndex; block > 0; block--)
            {
                System.out.print("#");
            }
            System.out.print("\n");
            blockIndex++;
        }
    }
}
