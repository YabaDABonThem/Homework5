
import java.util.Scanner;

// A "casino" class
public class StockMarket {

    public static void main(String Args[]) {

        // four reference variables, trader1, trader2, trader3, trader4, 
        // each of which references a new instance of an object of type Trader,
        // created using the non-standard constructor

        // set stock change percentage (stockChangePercentage) for each player (sample percentages)
        // trader1 has stock change percentage of 0.61
        // trader2 has stock change percentage of 0.19
        // trader3 has stock change percentage of 0.81
        // trader4 has stock change percentage of 0.42

        // invoke the getTraderName and getStockChangePercentage methods
        // for each Trader object, to retrieve that information, and print
        // it to the screen

        // create a variable, keyboard, of type Scanner, and set it
        // equal to a new object of type Scanner, that "listens" to
        // System.in	

        // a while loop, with a "true" conditional
        while (true) {
            // For each of the four traders, retrieve the trader's name, how much money hey/she spent,
            // how much money he/she currently has, and the trader's net profit. Print that information
            // to the screen. Look at the homework handout for sample output					
            // use a System.out.print statement to ask how much money each trader should bet. 
            // Then declare a variable dollarsSpend of type double, and set its value to the keyboard's
            // keystroke (be sure to use keyboard.nextDouble()).
            // If the user enters 0, then issue a break statement, so that the while loop terminates
            // Else, invoke the tradeSomeMore method of each Trader, and pass it the variable dollarsSpend		
        }

    }
}
