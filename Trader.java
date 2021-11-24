// Import the Random class
import java.util.Random;

// A Class that defines an object of type Trader
public class Trader {
    // fields; there are four of them, and each should be private:
    // 
    // traderName of type String
    // stockChangePercentage of type double
    // dollarsSpent of type double
    // dollarsMade of type double
    //
    private String traderName;
    private double stockChangePercentage;
    private double dollarsSpent;
    private double dollarsMade;
    // method: getStockChangePercentage, public
    // input: void
    // output: double
    // description: retrieves the value stockChangePercentage field
    //
    public double getStockChangePercentage() {
      return stockChangePercentage;
    }
    // method: setStockChangePercentage , public
    // input: percentage, which is of type double
    // output: void
    // description: assign the field stockChangePercentage to percentage
    //
    public void setStockChangePercentage(double percentage) {
      stockChangePercentage = percentage;
    }
    // method: tradeSomeMore, public
    // input parameter: dollars, which is of type double
    // output: none 
    // description (pseudocode):
    //
    // 1) increment field dollarsSpent by input value dollars
    // 2) declare randomNumbers of be of type Random, and instantiate new random class
    // 3) declare variable randomDouble of type double, and assign it the value output 
    //    by the method nextDouble() of randomNumbers
    // 4) if (randomDouble < stockChangePercentage){ 
    //        println(traderName + " made");
    //        dollarsMade += (dollars*2);
    //    else {
    //        println(traderName + " lost");
    //        dollarsMade -= dollars*3;
    //    }
    //
    public void tradeSomeMore(double dollars) {
    
      dollarsSpent += dollars;
      
      Random randomNumbers = new Random();
      double randomDouble = randomNumbers.nextDouble();
      
      if (randomDouble < stockChangePercentage) {
         System.out.println(traderName + " made");
         dollarsMade += (dollars*2);
      }
      
      else {
         System.out.println(traderName + " lost");
         dollarsMade -= dollars*3;
      }
    }
    // method: getTraderName, public
    // input paramter: none
    // output: value of field traderName
    //
    public String getTraderName() {
      return traderName;
    }
    // method: getDollarsSpent, public
    // input paramter: none
    // output: value of field dollarsSpent
    //
    public double getDollarsSpent() {
      return dollarsSpent;
    }
    // method: getDollarsMade, public
    // input paramter: none
    // output: value of field dollarsMade;
    //
    public double getDollarsMade() {
      return dollarsMade;
    }
    // method: getNetProfit, public
    // input paramter: none
    // output: result of (dollarsMade - dollarsSpent)
    //
    public double getNetProfit() {
      return (dollarsMade - dollarsSpent);
    }
    // Non-default constructor
    // input paramter: name, which is of type String
    // output: NA
    //
    // 1. set traderName to value in input argument name
    // 2. set dollarsMade to 1000 (all Traders begin with $1000)
    // 3. set dollarsSpent to 0 (all Traders begin neutrally)
    public Trader(String name) {
        traderName = name;
        dollarsMade = 1000;
        dollarsSpent = 0;
    }
}
