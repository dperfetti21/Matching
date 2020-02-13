/**
 * The Grid class provides a grid template with the maze pathway along with methods to move your position
 * up, down, left, and right and other methods to keep track of moves and positions. 
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
    private int totalMoves = 52;
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
                grid[4][2] = '-';
                grid[4][3] = '-';
                grid[7][7] = '-';
                for(int i =0; i < 8; i++)
                    grid[5][i] = '-';
                for(int i = 0; i<3; i++)
                    grid[3][i] = '-';
                grid[6][4] = '-';
                grid[7][4] = '-';
                grid[4][0] = '-';
                grid[5][6] = '-';
                grid[7][5] = '-';
                for(int i=5; i<8; i++)
                    grid[8][i] = '-';
                grid[4][6] = '-';
                for(int i = 5; i >0; i--)
                    grid[i][6] = '-';
                for(int i = 8; i< 12; i++)
                    grid[7][i] = '-';
                for(int i = 11; i< 14; i++)
                    grid[8][i] = '-';
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
                for(int i = 19; i <23; i++)
                    grid[7][i] = '-';
                grid[8][20] = '-';
                grid[8][22]= '-';
                for(int i = 13; i< 16; i++)
                    grid[2][i]= '-';
                for(int i = 15; i<19; i++)
                    grid[1][i] = '-';
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
     * establishes whether or not the position has reached the end of the maze.
     * @return true if the position is at the end 
     * @return false if not. 
     */
    public boolean atEnd()
    {
        if(grid[4][24] == 'o')
        {
            return true;
        }
        return false;
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
     * Gives back the numbers of moves made by the user. 
     * @return the number of moves the user has made.
     */
    public int returnMoves()
    {
        return userCount;
    }

    /**
     * moves your position right by one space and adds one to the counter. If the pathway is blocked
     * to the right, the position remains the same along with the counter. 
     */
    public void moveRight()
    {
        {

            if(curCol !=grid[0].length)
            {
                if(grid [curRow][curCol+1] =='-')
                {
                    grid[curRow][curCol]='-';
                    grid [curRow][curCol+1]='o';
                    curCol = curCol+1; 
                    userCount++;
                    totalMoves --;
                }
                    
                printing();
            }

            System.out.println("total moves: " + userCount);
            System.out.println("moves left: " + totalMoves);
        }

    }

    /**
     * moves your position down by one space and adds one to the counter. If the pathway is blocked
     * downwards, the position remains the same along with the counter. 
     */
    public void moveDown()
    {
        {
            if(curRow!=grid.length-1)
            {

                if(grid[curRow+1][curCol]=='-')
                {
                    grid[curRow][curCol]='-';
                    grid [curRow+1][curCol]='o';
                    curRow = curRow+1; 
                    userCount++;
                    totalMoves --;
                }
                printing();
            }

            System.out.println("total moves: " + userCount);
            System.out.println("moves left: " + totalMoves);
        }
    }

    /**
     * moves your position left by one space and adds one to the counter. If the pathway is blocked
     * to the left, the position remains the same along with the counter. 
     */
    public void moveLeft()
    {
        {
            if(curCol!=0)
            {
                if(grid[curRow][curCol-1]=='*')
                {
                    return;
                }
                if(grid [curRow][curCol-1]=='-')
                {
                    grid[curRow][curCol]='-';
                    grid [curRow][curCol-1]='o';
                    curCol = curCol-1; 
                    userCount++;
                    totalMoves --;
                }
                    
                printing();
            }

            System.out.println("total moves: " + userCount);
            System.out.println("moves left: " + totalMoves);
        }   

    }   
    /**
     * moves your position up by one space and adds one to the counter. If the pathway is blocked 
     * upwards, the position remains the same along with the counter. 
     */
    public void moveUp()
    {
        {
            if(curRow!=0)
            {
                if(grid[curRow-1][curCol]=='*')
                {
                    return;
                }
                if(grid [curRow-1][curCol]=='-')
                {
                    grid[curRow][curCol]='-';
                    grid [curRow-1][curCol]='o';
                    curRow = curRow-1; 
                    userCount++;
                    totalMoves--;
                }
                printing();
            }

            System.out.println("total moves: " + userCount);
            System.out.println("moves left: " + totalMoves);
        }
    }

}

