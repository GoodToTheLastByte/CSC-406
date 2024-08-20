import java.io.PrintWriter;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
	PrintWriter out1;
	private int Dstore [];
	private String Cstore[];
	private int[] storage;
	private int fill;
	private int bsize;
	private static Lock lockstrclr = new ReentrantLock();
	private static Condition infostorage = lockstrclr.newCondition();
	
	
	//Constructor 
	
	public Buffer(PrintWriter x) {
		out1=x;
		fill =0; 
		storage = new int[30];
		Dstore = new int[30];
		Cstore = new String[30];
		
		for(int i = 0; i <=29; i++) {
			storage[i] = 0;
			Dstore[i] = 0;
			Cstore[i] = "Blank";
		}
		
		
		
	}
	
	
	// return fill
	public int getfill() { return fill;}
	
	
	//print data 
	public void printdata() {
		for(int i = 0; i<=29;i++) {
			System.out.println(Cstore[i]+" ["+i+"] = "+Dstore[i]+" ");
		}
			System.out.flush();
		
	}
	
	//Store Data 
	
	public void storedata(String computer, int amt, int value) {
		lockstrclr.lock();
		
		try{
			while((fill+amt-1)>29)infostorage.await();
			
			out1.println("in storedata amt "+amt+" value "+value+" fill "+fill);
			
			System.out.flush();
			out1.flush();
			
			for(int i =fill; i<=fill+amt-1;i++){ Dstore[i] = value; Cstore[i] = computer;}
			fill = fill+amt;
			
			System.out.println("*Addition Done*");
			
			for(int i =0; i<=fill-1;i++)System.out.println(Cstore[i]+" ["+i+"] ="+Dstore[i]);
			System.out.println("******************************************");
			System.out.flush();
		}
		catch(InterruptedException ex){
			System.out.println("trouble in cacth in storedata");
			ex.printStackTrace();
		}
		finally{
			infostorage.signalAll();
			lockstrclr.unlock();
		}
	}
	
	
	//Clear Data 
	
	public void clearData(String computer,int amt) {
		lockstrclr.lock();
		try {
			
			System.out.flush();
			
			while(fill<1) infostorage.await();
			
			if(fill-amt-1<0) {
				int ifmt=fill-1;
				
				System.out.flush();
				for(int i=fill-1;i>=0;i--) {
					System.out.flush();
					Dstore[i] = 0;
					System.out.flush();
				}
				fill = 0;
			}
			else {
				int ifmt = fill-amt;
				int ifmt2=fill-1;
				System.out.flush();
				
				for(int i =fill-1;i>=fill-amt;i--) {
					System.out.flush();
					Dstore[i] =0;
					System.out.flush();
				}
				fill = fill-amt;
				System.out.flush();
			} 
			System.out.flush();
		}
		catch(InterruptedException ex) {
			System.out.println("trouble in catch in cleardata");
			ex.printStackTrace();
		}
		finally {
			infostorage.signalAll();
			lockstrclr.unlock();
		}
	}

}
