

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinOld implements Comparable
{
    private double value;
    private String name;
    public CoinOld(double value, String name)
    {
        this.value = value;
        this.name = name;
    }
    

    /**
     * @pre     other must be of class Coin
     */
    public int compareTo(Object other)
    {
        CoinOld otherCoin = (CoinOld) other;
        if (this.value < otherCoin.value) 
        {
            return -1;
        }
        else if (this.value > otherCoin.value) 
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public static void main(String[] args)
    {
        CoinOld quarter = new CoinOld(.25, "quarter");
        CoinOld dime = new CoinOld(.10, "dime");
        
        Comparable quarterObj = quarter;
        Comparable dimeObj = dime;
        if (quarterObj.compareTo(dimeObj) > 0)
        {
            System.out.println("Quarter is greater than dime.");
        }
    }

}
