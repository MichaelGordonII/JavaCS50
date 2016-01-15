//Some includes
import java.io.Console;
import java.util.Scanner;
public class Mario
{
	//Create scanner to obtain input with.
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		//initialize Rows to a numbr outside the boundaries we want.
		int Rows = 99;
		//Ask for rows.
		System.out.print("Enter the pyramid height in blocks:");
		//Call ObtainRows() which will loop until it obtains an integer.
		Rows = ObtainRow();
		//Make sure Rows is within the boundaries.
		while((Rows < 1) || (Rows > 50))
		{
			System.out.print("Invalid range. Please try again:");
			Rows = ObtainRow();
		}
		//Initialize Columns. Columns is always one more than Rows.
		int Columns = Rows;
		Columns++;
		//Initialize a BlockIndex which is how many blocks are in a given Row. The first Row is always two blocks.
		int BlockIndex = 2;
		//Initialize a SpaceIndex that is the number of spaces the first block is from the left-hand side of the screen.
		int SpaceIndex = 0;
		//Loop for every Row.
		for(int RowIndex = 0; RowIndex < Rows; RowIndex++)
		{
			//Space index is equal to the number of columns not taken up by Blocks.
			SpaceIndex = Columns - BlockIndex;
			//Print all spaces into Console.
			for(int Spaces = SpaceIndex; Spaces > 0; Spaces--)
			{
				System.out.print(" ");
			}
			//Print all Blocks into Console.
			for(int Block = BlockIndex; Block > 0; Block--)
			{
				System.out.print("#");
			}
			//Creates a new line and advances BlockIndex by one.
			System.out.print("\n");
			BlockIndex++;
		}
	}
	//Function used to obtain an Int from the User without causing any errors.
	public static int ObtainRow()
	{
		//If the input is not an Int, eat the input and wait for another one.
		while(!input.hasNextInt())
		{
			input.nextLine();
			System.out.print("Invalid input. Try again:");
		}
		return input.nextInt();
	}
}
