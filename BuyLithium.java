import java.util.HashMap;

/**
 * This class offers a buyer a chance to see all lithium which is the same or lower
 * than the price they give and to also see how many choices are available.
 * 
 * They can also enter a lithium grade and see all the lithium grades which are the
 * samegrade as the buyer entered and also grades which are of a higher grade. 
 * They can also see how many choices are available.
 *
 * @author (Adil Jawad)
 * @version (13/10/19)
 */
public class BuyLithium
{  
    LithiumPricing lithiumPricing;
    HashMap<Integer, Double> lithiumPricingMap; 

    /**
     * Constructor for objects of class BuyLithium.
     */
    public BuyLithium()
    { 
        //creating object of BuyLithium class.
        lithiumPricing = new LithiumPricing();
        
        //accessing the hashmap from BuyLithium class which takes in the Lithium Grade as the key and gives out the price as the value in 2 decimal places.
        lithiumPricingMap = lithiumPricing.lithiumPricingMap;
    } 
    
    /**
     * If the price of each lithium grade is in the range of the price
     * before the next price boundary, counter is incremented and
     * that particular lithium is printed with its grade and price in 2 decimal
     * places.
     * 
     * @param price The buyer enters the price to see all lithium which is the same 
     * or lower than the price they give.
     */
    public void findBestPrice(int price)
    {
        //intital number of lithium grades choices available.
        int counter = 0;
        
        if (price >= 300 && price <= 599)
        {
            for (int eachPrice : lithiumPricingMap.keySet())
            {
                if (lithiumPricingMap.get(eachPrice) <= price)
                {
                    counter++;
                    System.out.println(eachPrice + " " + String.format("%.2f", lithiumPricingMap.get(eachPrice)));
                }
            }
        } 
        else if (price <= 899)
        {
            for (int eachPrice : lithiumPricingMap.keySet())
            {
                if (lithiumPricingMap.get(eachPrice) <= price)
                {
                    counter++;
                    System.out.println(eachPrice + " " + String.format("%.2f", lithiumPricingMap.get(eachPrice)));
                }
            }
        }
        else if (price <= 1199)
        {
            for (int eachPrice : lithiumPricingMap.keySet())
            {
                if (lithiumPricingMap.get(eachPrice) <= price)
                {
                    counter++;
                    System.out.println(eachPrice + " " + String.format("%.2f", lithiumPricingMap.get(eachPrice)));
                }
            }
        }
        
        //prints out how many choices were available. If no if statements were true, counter will remain 0.
        System.out.println("There are " + counter + " choices available to you. ");
    }

    /**
     * @param grade Buyer can enter a lithium grade and see all the lithium grades 
     * which are the same as the grade entered and also grades which are of a higher 
     * grade. They can also see how many choices are available. 
     */
    public void findHighQuality(int grade)
    {
        //intital number of lithium grades choices available.
        int counter = 0;
        
        //if the grade entered is the same or lower than the maximum grade, each grade is printed which is more or the same as the entered grade and counter is incremented.
        if (grade <= 50)
        {
            for (int eachGrade : lithiumPricingMap.keySet())
            {
                if (eachGrade >= grade)
                {
                    counter++;
                    System.out.println(eachGrade + " " + String.format("%.2f", lithiumPricingMap.get(eachGrade)));
                }
            }
        }
        
        //prints out how many choices were available. If no if statements were true, counter will remain 0.
        System.out.println("There are " + counter + " choices available to you. ");
    }
}
