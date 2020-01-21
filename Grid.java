
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
        grid = new char [4][4];
        for(int r =0; r<grid.length; r++)
        {
            for(int c =0; c < grid[r].length; c++)
            {
                grid[r][c] = '*';
                grid[0][0] = 'o';
                grid[0][3] = 'o';
                grid[3][0] = 'o';
                grid[3][3] = 'o';
                System.out.print(grid[r][c] + " ");
            }
            System.out.println("");
        }
    }

   
}
