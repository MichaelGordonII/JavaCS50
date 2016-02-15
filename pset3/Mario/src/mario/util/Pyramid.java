package mario.util;

public class Pyramid
{
    int columns;
    int rows;
    public void setRows(int value)
    {
        rows = value;
    }
    public void setColumns(int value)
    {
        columns = value;
    }
    public java.lang.String toString()
    {
        StringBuilder result = new StringBuilder();
        int blockIndex = 2;
        int spaceIndex = 0;
        for (int rowIndex = 0; rowIndex < rows; rowIndex++)
        {
            spaceIndex = columns - blockIndex;
            for (int spaces = spaceIndex; spaces > 0; spaces--)
            {
                result.append(" ");
            }
            for (int block = blockIndex; block > 0; block--)
            {
                result.append("#");
            }
            result.append("\r\n");
            blockIndex++;
        }
        return(result.toString());
    }
}
