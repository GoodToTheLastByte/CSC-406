
public class Delete implements Runnable{

Buffer Bufx;
	
	
	public Delete(Buffer x ) {
		Bufx = x;
	}
	
	public void run() {
		String [] computers = {"PB1","FB2","PB1","MB3","FB4"};
		int [] subn ={2,2,4,3};
		
		for(int i=0;i<=3;i++){
			Bufx.clearData(computers[i],subn[i]);
			//System.out.println("just cleared "+subn[i]+" from the buffer int");
			//System.out.println("buffer fill is "+Bufx.getfill());
			System.out.flush();
			Thread.yield();
		}
	}

}
