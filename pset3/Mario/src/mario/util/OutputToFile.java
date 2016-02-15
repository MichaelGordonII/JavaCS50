package mario.util;
import mario.OutputType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputToFile implements OutputType
{
    public void outputPyramidBlocks(Pyramid pyramid)
    {
        File outputFile = new File("mario.txt");
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(outputFile);
            outputStream.print(pyramid.toString());
            System.out.println("Successful output to file!");
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
