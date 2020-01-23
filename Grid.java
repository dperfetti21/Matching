/**
 * 
 * 
 * @author (Willow, Declinda)
 * @version (January-February, 2020)
 */
public class Grid
{
    private char grid [][];
  
    public void gridOne ()
    {
        grid = new char [10][25];
        int r = 0;
        //set each box to a space
        for(int x =0; x<grid.length; x++)
        {
            for(int c =0; c< grid[x].length; c++)
            {
                grid[r][c] = 'X';
            }
        }
        //fill top and bottom 
        for(int c=0; c< grid[r].length; c++)
        {
            grid[r][c] = '*';
            grid[9][c] = '*';
        }
        //fill sides 
        for(int row = 0; row < grid.length; row++)
        {
            grid[row][0] = '*';
            grid[row][24] = '*';
        }
        grid[0][0] = 'o';
        
        for(int x =0; x < grid.length; x++)
        {
            for(int c =0; c < grid[x].length; c++)
            {
                System.out.print(grid[x][c] + " ");
            }
            System.out.println("");
        }
    }
}
