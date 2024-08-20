/*
 * 		Darrian Sampson
 * 
 * 		CSC 406
 * 
 * 		09/20/2016
 */
public class main {
	public static void main(String[] args) {
		
		
		// Create Task
		Runnable pGui = new GUI(300);
		Runnable pWP = new WP('A',300);
		Runnable pDS = new DataStorage(2500);
		Runnable pPrnt = new Printer(3600);
		
		// Create Thread
		Thread ThreadOne = new Thread(pGui);
		Thread ThreadTwo = new Thread(pWP);
		Thread ThreadThree = new Thread(pDS);
		Thread ThreadFour = new Thread(pPrnt);
		
		// Set Priority 
//		ThreadOne.setPriority(Thread.MIN_PRIORITY);
//		ThreadTwo.setPriority(Thread.MAX_PRIORITY);
//		ThreadThree.setPriority(Thread.NORM_PRIORITY);
//		ThreadFour.setPriority(Thread.NORM_PRIORITY);
		
		// Start Thread
		ThreadOne.start();
		ThreadTwo.start();
		ThreadThree.start();
		ThreadFour.start();
	}

}
