package mario;
import mario.util.OutputToFile;
import mario.util.OutputToConsole;
import mario.util.Pyramid;
import mario.util.PyramidFactory;

import java.util.Scanner;
import java.lang.*;
public class Mario
{
    public static void main(String[] args)
    {
        Scanner consoleInput = new Scanner(System.in);
        int rows = 99;
        System.out.print("Enter the pyramid height in blocks:");
        rows = obtainRowFromUser(consoleInput);
        while((rows < 1) || (rows > 50))
        {
            System.out.print("Invalid range. Please try again:");
            rows = obtainRowFromUser(consoleInput);
        }
        System.out.print("What is the desired output? (textfile or console):");
        String desiredOutputType = obtainOutputTypeFromUser(consoleInput);
        OutputType outputCommand = (desiredOutputType.equals("textfile")) ? new OutputToFile() : new OutputToConsole();
        int columns = rows + 1;
        Pyramid pyramid = PyramidFactory.newPyramid();
        pyramid.setRows(rows);
        pyramid.setColumns(columns);
        outputCommand.outputPyramidBlocks(pyramid);
    }
    public static String obtainOutputTypeFromUser(Scanner consoleInput)
    {
        String result = consoleInput.nextLine();
        result =  result.toLowerCase();
        return (result.equals("textfile")) || (result.equals("console")) ? result : obtainOutputTypeFromUser(consoleInput);
    }
    public static int obtainRowFromUser(Scanner consoleInput)
    {
        while (!consoleInput.hasNextInt()) {
            consoleInput.nextLine();
            System.out.print("Invalid input. Try again:");
        }
        return consoleInput.nextInt();
    }
}
