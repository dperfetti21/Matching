/**
 * The Game class provides a grid tempelate with the maze pathway along with 
 * methods to move your position up, down, left, and right and a counter to 
 * keep a tally of total moves. 
 *
 * @author (Willow, Declinda)
 * @version (Jan-Feb 2020)
 */
public class Grid
{
    private char [][] grid;
    int curRow=0 ;
    int curCol=0;
    private int userCount;
    /**
     * creates the tempelate for the grid filled in with its pathway. 
     */
    public Grid()
    {
        grid = new char[10][25];

        for(int r =0; r<grid.length; r++)
        {
            for(int c =0; c < grid[r].length; c++)
            {
                grid[r][c] ='*';
                grid[0][0] ='o';
                grid[1][0] = '-';
                grid[1][1] = '-';
                grid[2][1] = '-';
                grid[3][1] = '-';
                grid[3][2] = '-';
                grid[4][2] = '-';
                grid[4][3] = '-';
                for(int i =0; i < 8; i++)
                    grid[5][i] = '-';
                grid[3][0] = '-';
                grid[6][4] = '-';
                grid[7][4] = '-';
                grid[4][0] = '-';
                grid[5][6] = '-';
                grid[7][5] = '-';
                for(int i=5; i<8; i++)
                    grid[8][i] = '-';
                grid[7][8] = '-';
                grid[7][9] = '-';
                grid[4][6] = '-';
                for(int i = 5; i >0; i--)
                    grid[i][6] = '-';
                grid[7][10] = '-';
                grid[7][11] = '-';
                grid[8][11] = '-';
                grid[8][12] = '-';
                grid[8][13] = '-';
                for(int i = 2; i <8; i++)
                    grid[i][13] = '-';
                grid[4][14] = '-';
                grid[4][15] = '-';
                grid[4][16] = '-';
                for(int i= 16; i<20; i++)
                    grid [5][i] = '-';
                grid[6][17] = '-';
                grid[7][16] = '-';
                grid[7][17] = '-';
                grid[8][16] = '-';
                grid[9][16] = '-';
                for(int i = 16; i< 24; i++)
                    grid[9][i] = '-';
                grid[8][20] = '-';
                grid[7][20]= '-';
                grid[7][21]= '-';
                grid[7][22]= '-';
                grid[8][22]= '-';
                grid[2][14] = '-';
                grid[2][15] = '-';
                grid[2][16] = '-';
                grid[1][15]= '-';
                grid[1][16]= '-';
                grid[1][17]= '-';
                grid[1][18] = '-';
                grid[2][18] = '-';
                grid[6][21] = '-';
                grid[5][21] = '-';
                grid[4][21] = '-';
                for(int i = 22; i<25; i++)
                    grid[4][i] = '-';
                System.out.print(grid[r][c] + " ");

            }
            System.out.println("");
        }

    }
    /**
     * prints out the grid created
     */
    public void printing()
    {
        for(int r= 0; r< grid.length; r++)
        {for (int c=0 ;c< grid[r].length;c++)
            {
                System.out.print(grid[r][c]+" "); 
            } 

            System.out.println();
        }
    }
    /**
     * returns the numbers of moves made by the user. 
     * @returns the number of moves the user has made.
     */
    public int returnMoves()
    {
        return userCount;
    }
    
    /**
     * moves your position right by one space and adds the move to the 
     * counter. If the pathway is blocked to the right, the position remains
     * the same along with the counter. 
     */
    public void moveRight()
    {
        if(curCol !=grid[0].length)
        {
            if(grid[curRow][curCol+1]=='*')
            {
                printing();
            }
            if(grid [curRow][curCol+1] =='-')
            {
                grid[curRow][curCol]='-';
                grid [curRow][curCol+1]='o';
                curCol = curCol+1; 
                userCount++;
                printing();

            }
        }
        else printing();
        System.out.println("total moves: " + userCount);
    }

    /**
     * moves your position down by one space and adds the move to the 
     * counter. If the pathway is blocked downwards, the position remains
     * the same along with the counter. 
     */
    public void moveDown()
    {
        if(curRow!=grid.length-1)
        {
            if(grid[curRow+1][curCol]=='*')
            {
                printing();
            }
            if(grid[curRow+1][curCol]=='-')
            {
                grid[curRow][curCol]='-';
                grid [curRow+1][curCol]='o';
                curRow = curRow+1; 
                userCount++;
                printing();

            }
        }
        else printing();
        System.out.println("total moves: " + userCount);

    }

    /**
     * moves your position left by one space and adds the move to the 
     * counter. If the pathway is blocked to the left, the position remains
     * the same along with the counter. 
     */
    public void moveLeft()
    {
        if(curCol!=0)
        {
            if(grid[curRow][curCol-1]=='*')
            {
                printing();
            }
            if(grid [curRow][curCol-1]=='-')
            {
                grid[curRow][curCol]='-';
                grid [curRow][curCol-1]='o';
                curCol = curCol-1; 
                userCount++;
                printing(); 

            }
        }
        else printing();
        System.out.println("total moves: " + userCount);

    }   

    /**
     * moves your position up by one space and adds the move to the 
     * counter. If the pathway is blocked upwards, the position remains
     * the same along with the counter. 
     */
    public void moveUp()
    {
        if(curRow!=0)
        {
            if(grid[curRow-1][curCol]=='*')
            {
                printing();
            }
            if(grid [curRow-1][curCol]=='-')
            {
                grid[curRow][curCol]='-';
                grid [curRow-1][curCol]='o';
                curRow = curRow-1; 
                userCount++;
                printing();

            }
        }
        else printing();
        System.out.println("total moves: " + userCount);

    }
    
}

