import java.util.Scanner;
/**
 * The Game class provides a grid tempelate with the maze pathway along with 
 * methods to move your position up, down, left, and right and a counter to 
 * keep a tally of total moves. 
 *
 * @author (Willow, Declinda)
 * @version (Jan-Feb 2020)
 */
public class Game
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userInput = "";
        Grid maze =new Grid();
        do
        {
            userInput = in.nextLine();        
            if ("w".equals(userInput))
            {   System.out.print("\f");
                maze.moveUp();
            }
            else if ("s".equals(userInput))
            {
                System.out.print("\f");
                maze.moveDown();
            }
            else if ("a".equals(userInput))
            {
                System.out.print("\f");
                maze.moveLeft();
            }
            else if ("d".equals(userInput))
            {
                System.out.print("\f");
                maze.moveRight();
            }
        }
        while(maze.returnMoves()<50);

    }

    
}
