/*  ***********_______________************		
 *  *********(                 )*** ****** 
 * ****** ***\ Darrian Sampson /*** ******
 * ****** ****\    CSC 406    /**** ******
 * ****** *****\ Problem #2	 /***** ******
 * ******  *****-------------****** ******
 * 
 * !DISCLAIMER! 
 * I could have made this program a lot less cluttered and to the point although I failed to see that I should have made objects for 
 * each branch to appropriately store attributes instead of complicating it by doing everything in my Router class.  
 * 
 * DESCRIPTION:
 * In this program 9 threads are created and launched with branch information.
 * There are 3 separate branch types.
 * Print and data storage is monitored and used to calculate branch cost in printing/processing with a grand total for each branch.
 * Each branch will have their number of print, data, and total characters displayed along with costs. 
 * 
 */
public class main {
	public static void main(String[] args) {
		
		// Create Task
		
		Runnable PB1 = new Router("PB",1,'D',60000);
		Runnable PB2 = new Router("PB",3,'P',100000);
		Runnable PB3 = new Router("PB",2,'D',75000);
		
		Runnable FB1 = new Router("FB",1,'P',30000);
		Runnable FB2 = new Router("FB",2,'D',150000);
		Runnable FB3 = new Router("FB",3,'P',89000);
		
		Runnable MB1 = new Router("MB",1,'P',200000);
		Runnable MB2 = new Router("MB",2,'D',140000);
		Runnable MB3 = new Router("MB",3,'P',135000);
		
		// Create Thread
		
		Thread PB1Thread = new Thread(PB1);
		Thread PB2Thread = new Thread(PB2);
		Thread PB3Thread = new Thread(PB3);
		
		Thread FB1Thread = new Thread(FB1);
		Thread FB2Thread = new Thread(FB2);
		Thread FB3Thread = new Thread(FB3);
		
		Thread MB1Thread = new Thread(MB1);
		Thread MB2Thread = new Thread(MB2);
		Thread MB3Thread = new Thread(MB3);
		
		// Launch Threads 
		
		 PB1Thread.start(); 
		 PB2Thread.start(); 
		 PB3Thread.start();
		 
		 FB1Thread.start();
		 FB2Thread.start();
		 FB3Thread.start();
		
		 MB1Thread.start();
		 MB2Thread.start();
		 MB3Thread.start();
		 
		 
		 
		
		
		
	}

}
