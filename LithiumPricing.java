import java.util.HashMap;

/**
 * This class ensures each lithium is given a price.
 *
 * @author (Adil Jawad)
 * @version (13/10/19)
 */
public class LithiumPricing
{
    GenerateLithium generateLithium;
    HashMap<Integer, Double> lithiumPricingMap;
    
    /**
     * Constructor for objects of class LithiumPricing
     */
    public LithiumPricing()
    {
        //creating object of GenerateLithium class.
        generateLithium = new GenerateLithium();
        
        //creating a new hashmap to take in the Lithium Grade as the key and give out the price as the value in 2 decimal places.
        lithiumPricingMap = new HashMap<Integer, Double>();
        
        //executing the generateSample() method to generate the lithium sample in the GenerateLithium class.
        generateLithium.generateSample();
        
        //passing the lithium tray inside the setPrice method so that it can be used.
        setPrice(generateLithium.tray);
    }
    
    /**
     * Checking to see if each grade in each position of the two-dimensional array is 
     * in a specific range so that prices can be assigned. 
     * 
     * @param lithiumTray[][] takes in the two-dimensional array containing lithium.
     */
    public void setPrice(int lithiumTray[][])
    {  
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (lithiumTray[i][j] >= 1 && lithiumTray[i][j] <= 9)
                {
                    lithiumPricingMap.put(lithiumTray[i][j], 300.00); 
                }
                else if (lithiumTray[i][j] >= 10 && lithiumTray[i][j] <= 19)
                {
                    lithiumPricingMap.put(lithiumTray[i][j], 600.00);
                }
                else if (lithiumTray[i][j] >= 20 && lithiumTray[i][j] <= 29)
                {
                    lithiumPricingMap.put(lithiumTray[i][j], 900.00);
                }
                else if (lithiumTray[i][j] >= 30)
                {
                    lithiumPricingMap.put(lithiumTray[i][j], 1250.00);
                }
            }
        }
    }
    
    /**
     * Printing the hashmap to display each lithium grade with its price in 2 decimal
     * places.
     */
    public void printPrice()
    {
        for (int price : lithiumPricingMap.keySet())
        {
            System.out.println(price + " " + String.format("%.2f", lithiumPricingMap.get(price)));
        }
    }
}
