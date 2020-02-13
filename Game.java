import java.util.Scanner;
/**
 * The Game class allows users to play the maze game by inputting movements for right, left, up, and down.
 *
 * @author (Willow, Declinda)
 * @version (Jan-Feb 2020)
 */
public class Game
{
    /**
     * When running, the game uses the user input to move the character up, down, left, or right. 
     * The screen will clear then print out the moved grid. 
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userInput = "";
        Grid maze =new Grid();
        System.out.println("Press 'w' to move up, 's' to move down, 'a' to move left");
        System.out.println("and 'd' to move right.");
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
            if(maze.atEnd())
            {
                System.out.print("\f");
                System.out.println("YOU WIN!");
            }
            if(maze.returnMoves() > 52)
            {
                System.out.println("You Lost :(");
            }
        }
        while(maze.returnMoves()<52);

    }

    
}
