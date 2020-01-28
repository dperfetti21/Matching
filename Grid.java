
/**
 * Write a description of class Grid here.
 *
 * @author (Willow, Declinda)
 * @version (Jan 2020)
 */
public class Grid
{
    private char [][] grid;
    int curRow=0;
    int curCol=0;
    public void gridOne()
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
                System.out.print(grid[r][c] + " ");
            }
            System.out.println("");
        }
    }

    public void printing()
    {
        for(int r= 0; r< grid.length; r++)
        {
            for (int c=0 ;c< grid[r].length;c++)
            {
                System.out.print(grid[r][c]+" "); 
            } 
            System.out.println();
        }
    }
    
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
             printing();
                
            }
        }
        else printing();
    }
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
             printing();  
            }
        }
    }
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
             printing();  
            }
        }
        
    }
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
             printing();  
            }
        }
        
    }


}