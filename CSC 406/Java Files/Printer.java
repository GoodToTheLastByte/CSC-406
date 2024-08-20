

public class Printer implements Runnable{
	private int charCount;
	
	
	
	public Printer(int charCount) {
		this.charCount = charCount;
	}
	
	
	
	
	public void run() {
		int charNum = 0;
		int lineNum = 0;
		for(int i = 1; i<=3600/360;i++) {
			for(int j = 1; j <= 6; j++) {
				System.out.println("Print Line:["+lineNum+"] characters :["+charNum+"] thru ["+(charNum+60)+"]");
				lineNum++;
				charNum+=60;
			}
			Thread.yield();
		}
		

		
		
	}



	public int getCharCount() {
		return charCount;
	}



	public void setCharCount(int charCount) {
		this.charCount = charCount;
	}



	@Override
	public String toString() {
		return "Printer [charCount=" + charCount + "]";
	}
	
	
	
	

}
