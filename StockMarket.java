// Allen Bao
// 11/23/21
// A program that runs a stock market simulation by betting the amount the user inputs for 4 different traders.
// Each trader has a different name and success rate, but starts off with the same amount of money (1000 dollars)

// import scanner class
import java.util.Scanner;

// A "casino" class
public class StockMarket {

    public static void main(String Args[]) {

        // create 4 instances of the trader class, each one representing a different trade
        Trader trader1 = new Trader("Trader1");
        Trader trader2 = new Trader("Trader2");
        Trader trader3 = new Trader("Trader3");
        Trader trader4 = new Trader("Trader4");

        // set stock change percentage (stockChangePercentage) for each player (sample percentages)
        trader1.setStockChangePercentage(0.61);
        trader2.setStockChangePercentage(0.19);
        trader3.setStockChangePercentage(0.81);
        trader4.setStockChangePercentage(0.42);        

        // print the name of each trader and their stockChangePercentage
        System.out.println("Name: " + trader1.getTraderName() + " \nStockChangePercentage: " + trader1.getStockChangePercentage());
        System.out.println("Name: " + trader2.getTraderName() + " \nStockChangePercentage: " + trader2.getStockChangePercentage());
        System.out.println("Name: " + trader3.getTraderName() + " \nStockChangePercentage: " + trader3.getStockChangePercentage());
        System.out.println("Name: " + trader4.getTraderName() + " \nStockChangePercentage: " + trader4.getStockChangePercentage());

        // create scanner
        Scanner keyboard = new Scanner(System.in);
        
        // initialize variable used in loop
        double dollarsSpend;
        
        // infinite while loop
        while (true) {
        
            // print each trader's name, amount spent, the dollars made, and net profit
            System.out.println("\nName: " + trader1.getTraderName() + "\nDollars Spent: " + trader1.getDollarsSpent() + "\nBalance: " + trader1.getDollarsMade() + "\nNet Profit: " + trader1.getNetProfit());
            System.out.println("\nName: " + trader2.getTraderName() + "\nDollars Spent: " + trader2.getDollarsSpent() + "\nBalance: " + trader2.getDollarsMade() + "\nNet Profit: " + trader2.getNetProfit());
            System.out.println("\nName: " + trader3.getTraderName() + "\nDollars Spent: " + trader3.getDollarsSpent() + "\nBalance: " + trader3.getDollarsMade() + "\nNet Profit: " + trader3.getNetProfit());
            System.out.println("\nName: " + trader4.getTraderName() + "\nDollars Spent: " + trader4.getDollarsSpent() + "\nBalance: " + trader4.getDollarsMade() + "\nNet Profit: " + trader4.getNetProfit());
            
            // ask the user how much they want to bet and store their input in dollarsSpend
            System.out.println("How much money do you want to bet? ");
            dollarsSpend = keyboard.nextDouble(); // Inputs that'd break the code would be strings and characters that aren't numbers
            
            // if user bets zero dollars the while loop terminates
            if (dollarsSpend == 0) {
               break;
            }
            
            // bet the money the user inputted
            else {
               trader1.tradeSomeMore(dollarsSpend);
               trader2.tradeSomeMore(dollarsSpend);
               trader3.tradeSomeMore(dollarsSpend);
               trader4.tradeSomeMore(dollarsSpend);
            }
        }

    }
}
