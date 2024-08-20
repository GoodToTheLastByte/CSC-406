/* ****** ****_______________**** ******
 * ****** ***|Darrian Sampson|*** ******
 * ****** ***|CSC 406 Prob_03|*** ******
 * ****** ***|Oct/03/2016    |*** ******
 * ****** ***-----------------*** ******
 * --------------------------------------------------------------------------
 * |DESCRIPTION: This program sets out with a few things to accomplish.  	|
 * |To create two threads as to add and delete data. These are classes that |
 * |implement Runnable so that they can be wrapped into threads that can be |
 * |launched simultaneously. The storage and delete information are with in |
 * |they're respective classes. A buffer class is created with store and 	|
 * |clear functions. 														|
 * |																		|
 * |We instance a buffer Object, pass that to the add and delete threads and|
 * |give the add and delete over to executor to launch these threads.    	|											
 * |Storage is done with two parallel arrays, one for String to display the |
 * | specific computer and the other for the integer value that is added.	|
 * |------------------------------------------------------------------------|
 * 
 * 
 */






import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter outf1;
		outf1 = new PrintWriter(new File("ThreadsCooperating.txt"));
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		// Create the buffer objects
		Buffer Buf1 = new Buffer(outf1);
		
		Add tadd=new Add(Buf1);
		Delete tdelete = new Delete(Buf1);
		
		executor.execute(tadd);
		executor.execute(tdelete);
		System.out.println("Thread add and delete created and launched");
		System.out.flush();
		outf1.println("Thread add and delete created and launched");
		outf1.flush();
		
		executor.shutdown();
		
		while(!executor.isTerminated());
		System.out.println("What is in the Buffer?");
		Buf1.printdata();
		System.out.flush();
	}
	
	
	}


