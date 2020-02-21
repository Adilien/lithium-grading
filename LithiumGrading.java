import java.util.ArrayList;

/**
 * This class uses the tray of lithium in GenerateLithium to grade lithium.
 *
 * @author (Adil Jawad)
 * @version (13/10/19)
 */
public class LithiumGrading
{
    GenerateLithium generateLithium;
    ArrayList<Integer> highGrade;
    ArrayList<Integer> lowGrade;

    /**
     * Constructor for objects of class LithiumGrading
     */
    public LithiumGrading()
    {
        //creating object of GenerateLithium class.
        generateLithium = new GenerateLithium();
        
        //making an arraylist with type Integer containing lithium grade with value higher than 25.
        highGrade = new ArrayList();
        
        //making an arraylist with type Integer containing lithium grade with value lower than 25 or 25.
        lowGrade = new ArrayList();
    }

    /**
     * Accepts lithium tray and looks at the grade of each lithium to see if it is
     * high quality or not. It is added in the highGrade arraylist if it is over 25
     * and added to lowGrade if it is lower than 25 or 25.
     * 
     * @param lithiumTray[][] accepts the two-dimesional array with the lithium
     * to make decision whether it is high quality or low quality.
     */
    public void generateGrades(int lithiumTray[][])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (lithiumTray[i][j] > 25)
                {
                    highGrade.add(lithiumTray[i][j]);
                }
                else if (lithiumTray[i][j] <= 25)
                {
                    lowGrade.add(lithiumTray[i][j]);
                }
            }
        }
    }

    /**
     * Sorts both arraylists (highGrade and lowGrade) in ascending order using
     * bubble sort.
     */
    public void sortingLithium()
    {
        //setting up initial variables.
        int temp;
        boolean sorted = false;

        /* the while loop has to run multiple times as the arraylist has to be 
         * iterated over multiple times to make sure every element is in ascending order.
        */
        while (sorted == false) //while loop runs till sorted is true.
        {
            sorted = true;
            
            for (int i = 0; i < lowGrade.size() - 1; i++)
            {
                if (lowGrade.get(i) > lowGrade.get(i+1))
                {
                    temp = lowGrade.get(i+1);
                    lowGrade.set(i+1, lowGrade.get(i)); //switching element location
                    lowGrade.set(i, temp);
                    sorted = false; //if this if statement is true, that means our arraylist is not sorted. This makes sorted false again.
                }
            }
        }
        
        //resetting sorted to false so that the next while loop runs.
        sorted = false;
        
        while (sorted == false) 
        {
            sorted = true;
            
            for (int i = 0; i < highGrade.size() - 1; i++)
            {
                if (highGrade.get(i) > highGrade.get(i+1))
                {
                    temp = highGrade.get(i+1);
                    highGrade.set(i+1, highGrade.get(i));
                    highGrade.set(i, temp);
                    sorted = false;
                }
            }
        }
    }
}
