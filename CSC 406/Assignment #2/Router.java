
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Router implements Runnable{
	private String Branch;
	private int comPort;
	private char connection;
	private int charNum;
	private static int k = 1;
		
	//PB
	public static int PBTot;
	public static int PBprint;
	public static int PBdata;
	public static int PBprintCost;
	public static int PBdataCost;
	public static int PBTotCost;
	
	//MB
	private static int MBTot;
	private static int MBprint;
	private static int MBdata;
	public static int MBprintCost;
	public static int MBdataCost;
	public static int MBTotCost;
	
	//FB
	private static int FBTot;
	private static int FBprint;
	private static int FBdata;
	public static int FBprintCost;
	public static int FBdataCost;
	public static int FBTotCost;
	
	private static Lock lock = new ReentrantLock();
	
	
	// Constructor 
	
	public Router (String Branch, int comPort, char connection, int charNum) {
		this.Branch = Branch;
		this.comPort = comPort;
		this.connection = connection;
		this.charNum = charNum;
	}
	
	
	// Task
	public void run() {
		lock.lock();
		
		
		// Production
		if(Branch == "PB"){
		
			
			// What connection?
			if(connection == 'D') {
				for(int i = 1; i <= charNum; i++) {
					PBdata++;
					
				}
				PBdataCost = (int) (PBdata * (0.008)); 
				
				
				
				}
			else {
				for(int i = 1; i <= charNum; i++) {
					PBprint++;
				}
				PBprintCost = (int) (PBprint * (0.007));
				
				
				
				
			}
			PBTot = (PBdata + PBprint);
			PBTotCost = (PBdataCost + PBprintCost);
			
		}
		
		
		
		
		// Marketing
		else if(Branch == "MB"){
			
			
			if(connection == 'D') {
				for(int i = 1; i <= charNum; i++) {
					MBdata++;
				}
				MBdataCost = (int) (MBdata * (0.0082)); 
				
				
				
				}
			else {
				for(int i = 1; i <= charNum; i++) {
					MBprint++;
				}
				MBprintCost = (int) (MBprint * (0.0095));
				
			
			
			}
			
			MBTot = (MBdata + MBprint);
			MBTotCost = (MBdataCost + MBprintCost);
			
		}
		
		
		// Financial 
		else if(Branch == "FB"){
		
		
		
		if(connection == 'D') {
			for(int i = 1; i <= charNum; i++) {
				FBdata++;
			}
			FBdataCost = (int) (FBdata * (0.007)); 
			
			
			}
		else {
			for(int i = 1; i <= charNum; i++) {
				FBprint++;
			}
			FBprintCost = (int) (FBprint * (0.009)); 
			
			}
		FBTot = (FBdata + FBprint);
		FBTotCost = (FBdataCost + FBprintCost);
		
		
		System.out.println();
		
		
		}
		
		// Output 
		if(k == 9) {
		System.out.println("Branch : [Production] Data Characters : ["+PBdata+"] Print Characters : ["+PBprint+"] Total Characters : ["+PBTot+"] Processing Cost: ["+PBdataCost+"] Printing Cost : ["+PBprintCost+"] Total Cost : ["+(PBTotCost)+"]" );
		System.out.println();
		System.out.println("Branch : [Marketing] Data Characters : ["+MBdata+"] Print Characters : ["+MBprint+"] Total Characters : ["+MBTot+"] Processing Cost: ["+MBdataCost+"] Printing Cost : ["+MBprintCost+"] Total Cost : ["+(MBTotCost)+"]" );
		System.out.println();
		System.out.println("Branch : [Financial] Data Characters : ["+FBdata+"] Print Characters : ["+FBprint+"] Total Characters : ["+FBTot+"] Processing Cost: ["+FBdataCost+"] Printing Cost : ["+FBprintCost+"] Total Cost : ["+(FBTotCost)+"]" );
		}
		
		k++;
		lock.unlock();
		
		Thread.yield();
		
	}
	
	


	// Setters
	public void setBranch(String branch) {
		Branch = branch;
	}


	public void setComPort(int comPort) {
		this.comPort = comPort;
	}
	
	
	public void setConnection(char connection) {
		this.connection = connection;
	}

	public void setCharNum(int charNum) {
		this.charNum = charNum;
	}
	
	
	// Getters 
	public String getBranch() {
		return Branch;
	}


	public int getComPort() {
		return comPort;
	}


	public char getConnection() {
		return connection;
	}


	public int getCharNum() {
		return charNum;
	}

	// To String
	@Override
	public String toString() {
		return "Router [Branch=" + Branch + ", comPort=" + comPort + ", connection=" + connection + ", charNum="
				+ charNum + "]";
	}



	
	


	

}
