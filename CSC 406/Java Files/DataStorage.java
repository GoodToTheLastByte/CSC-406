
public class DataStorage implements Runnable{
	private int runTime;

	
	
	public DataStorage(int runTime) {
		this.runTime = runTime;
	}
	
	
	
	
	public void run() {
		int charNum = 0;
		
		for(int i = 1; i <= runTime; i++) {
			
			if(i % 3 == 0) {
				if(i > 300){
					return;
				}
				charNum += 20;
				System.out.println("DS:"+charNum);
				Thread.yield();
			}
		}
	}


	public int getRunTime() {
		return runTime;
	}


	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}




	@Override
	public String toString() {
		return "DataStorage [runTime=" + runTime + "]";
	}




	
	
	
	
	
	

}
