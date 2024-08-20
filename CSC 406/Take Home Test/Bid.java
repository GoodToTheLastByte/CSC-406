
public class Bid implements Runnable{
	ForSale item;
	private int itemNo;
	private int bidNo;
	private double bidAmt;
	private int bidTime;
	
	public Bid(ForSale x,int bidNo, int itemNo, double bidAmt, int bidTime) {
		item = x;
		this.bidNo = bidNo;
		this.itemNo = itemNo;
		this.bidAmt = bidAmt;
		this.bidTime = bidTime;
	}
	
	
	
	public void run() {
		item.myBid(bidNo, itemNo, bidAmt, bidTime);
		
	}

}
