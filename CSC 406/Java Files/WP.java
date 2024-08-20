
public class WP implements Runnable{
	private int [] charList;
	private char character;
	private int runTime;

	
	
	public WP(char charater, int runTime) {
		this.character = character;
		this.runTime = runTime;
	}
	
	
	public void run() {
		
		for(int i = 1; i <= runTime; i++){
			System.out.println("WP:"+i);
			
			if(i % 10 == 0) {
				System.out.println();
				Thread.yield();
			}
			
			
			
		}
	}



	public char getCharacter() {
		return character;
	}



	public void setCharacter(char character) {
		this.character = character;
	}



	public int getRunTime() {
		return runTime;
	}



	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}



	@Override
	public String toString() {
		return "WP [character=" + character + ", runTime=" + runTime + "]";
	}
	
	
	
	
	
	
	
	
	
}
