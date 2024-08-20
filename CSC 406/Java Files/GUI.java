
public class GUI implements Runnable{
	private int runTime;
	
	
	
	
	public GUI(int runTime) {
		this.runTime = runTime;
	}
	
	
	
	
	
	
	public void run(){
		
		for(int i = 1; i <=runTime;i++) {
			System.out.println("GUI Poll");
			System.out.println("GUI Poll");
			System.out.println();
			Thread.yield();
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
		return "GUI [runTime=" + runTime + "]";
	}

}
