/* ****** ****____________________________**** ******
 * ****** ***|	Darrian Sampson			  |*** ******
 * ****** ***|	CSC 406 Take Home Test 01 |*** ******
 * ****** ***|	Oct/13/2016    			  |*** ******
 * ****** ***|----------------------------|*** ******
 * |--------------------------------------------------------------------------------|
 * |DESCRIPTION: This is the take home portion of the in class test over Threads.	|
 * |I take the ForSale class and recreate it, make a runnable class for the Bid		|
 * |task and use the myBid function in ForSale to process the bids that are made	|
 * |on the bidding item "Dutch Masters Oil Painting". After that I wait for the		|
 * |launched threads to complete and print out the bids that were made on that 		|
 * |item.                                                                           |
 * |--------------------------------------------------------------------------------|
 * 
 * 
 */
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class main {
	public static void main(String[] args) {
		int i = 0;

		// Instance that ForSale object 
		
		ForSale item1 = new ForSale("Dutch Masters Oil Painting",60000.00,5000.00);
		
		
		// Create the fixed Thread pool 
		
		ExecutorService executor = Executors.newFixedThreadPool(6);
		
		
		// Create the Bids 
		
		Runnable Bid1 = new Bid(item1,5283,4827,4000.00,18481);
		Runnable Bid2 = new Bid(item1,4681,4827,15000.00,18482);
		Runnable Bid3 = new Bid(item1,5283,4827,14500.00,18483);
		Runnable Bid4 = new Bid(item1,5283,4827,17500.00,18485);
		Runnable Bid5 = new Bid(item1,4681,4827,25000.00,18489);
		Runnable Bid6 = new Bid(item1,5283,4827,32000.00,18495);
		
		
		// Launch those Threads 
		
		executor.execute(Bid1);
		executor.execute(Bid2);
		executor.execute(Bid3);
		executor.execute(Bid4);
		executor.execute(Bid5);
		executor.execute(Bid6);
		
		
		
		// Print out the bids that have been made on that object
		
		
		System.out.println("ATTENTION: Waiting for Threads to finish ");
		System.out.println();
		
		
		
		
		executor.shutdown();
		while(!executor.isTerminated()) {
			i++;
			if(i%2500 == 0){
			System.out.println("Waiting......");
			}
		}
		
		System.out.println();
		System.out.println("Bidders in the last ten minutes of the items bidding time : ");
		System.out.println();
		System.out.println();
		
		for(int j = 1; j <= 10;j++) {
		System.out.println(item1.list.get(j));
		}
	

    
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
		
		
		
		
		
		
	

}







