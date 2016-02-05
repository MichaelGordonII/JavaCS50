package w.mario.src; //this is the full path to the source files.
import java.io.Console;
import java.util.Scanner;
import java.lang.*;
import w.mario.src.output.OutputToFile;
import w.mario.src.output.OutputToConsole;

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
        outputCommand.outputPyramidBlocks(rows, columns);
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
