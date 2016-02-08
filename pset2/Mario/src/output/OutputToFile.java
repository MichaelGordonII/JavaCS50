package w.mario.src.output;
import w.mario.src.OutputType;
import java.io.PrintWriter;
public class OutputToFile implements OutputType
{
    public void outputPyramidBlocks(int rows, int columns)
    {
        File outputFile = new File("mario.txt");
        try (PrintWriter outputStream = new PrintWriter(outputFile))
        {
            int blockIndex = 2;
            int spaceIndex = 0;
            for (int rowIndex = 0; rowIndex < rows; rowIndex++)
            {
                spaceIndex = columns - blockIndex;
                for (int spaces = spaceIndex; spaces > 0; spaces--)
                {
                    outputStream.print(" ");
                }
                for (int block = blockIndex; block > 0; block--)
                {
                    outputStream.print("#");
                }
                outputStream.print("\n");
                blockIndex++;
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error. File not found. " + e.getMessage());
        }
        finally
        {
            outputStream.close();
        }
    }
}
