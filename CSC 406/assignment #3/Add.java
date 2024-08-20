
public class Add implements Runnable{
Buffer Bufx;
	
	
	
	public Add(Buffer x ) {
		Bufx = x;
	}
	
	
	public void run() {
		String [] computers = {"PB1","FB2","PB1","MB3","FB4"};
		int [] addn = {5,6,8,10,6};
		int [] nadd = {-3,78,13,22,75};
		
		for(int i=0; i<=4; i++) {
			Bufx.storedata(computers[i],addn[i],nadd[i]);
			System.out.flush();
			Thread.yield();
		}
	}

}
