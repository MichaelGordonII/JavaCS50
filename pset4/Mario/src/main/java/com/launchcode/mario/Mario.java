package com.launchcode.mario;
        import com.launchcode.mario.util.OutputToFile;
        import com.launchcode.mario.util.OutputToConsole;
        import com.launchcode.mario.util.Pyramid;
        import com.launchcode.mario.util.PyramidFactory;

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

        import java.util.Scanner;
        import java.lang.*;
public class Mario
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Mario objMario = (Mario) context.getBean("mario1");
        objMario.startMario();
    }
    private PyramidFactory pyramidFactory;
    public Mario(PyramidFactory pyramidFactory)
    {
        this.pyramidFactory = pyramidFactory;
    }
    public void startMario()
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
        Pyramid pyramid = pyramidFactory.newPyramid(rows);
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
        while (!consoleInput.hasNextInt())
        {
            consoleInput.nextLine();
            System.out.print("Invalid input. Try again:");
        }
        return consoleInput.nextInt();
    }
}
