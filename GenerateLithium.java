import java.util.Random;

/**
 * This class is responsible for generating a tray of lithium.
 *
 * @author (Adil Jawad)
 * @version (13/10/19)
 */
public class GenerateLithium
{
    //two-dimensional array
    int tray [][] = new int [5][3];
    
    //initial grade set to 0;
    private int grading = 0;
    
    private Random randomGenerator;

    /**
     * Constructor for objects of class GenerateLithium.
     */
    public GenerateLithium()
    {
        randomGenerator = new Random();
    }

    /**
     * Looping through the two-dimensional array and generating numbers between 1 to 50.
     * Each random number is then put inside each index of the array.
     */
    public void generateSample()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                grading = randomGenerator.nextInt(50) + 1;
                tray[i][j] = grading;
            }
        }
    }

    /**
     * Looping through the two-dimensional array and printing out the numbers in
     * each position. 
     */
    public void printTray()
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(tray[i][j] + " || ");
            }

            System.out.println();
        }
    }
}

