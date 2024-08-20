import java.util.ArrayList;

public class ForSale {
		private String itemDes;
		private double buyItNow;
		private double currentBid;
		private double minBid;
		private double newBid;
		private int itemNo;
		private int cTime;
		ArrayList<String> list = new ArrayList<String>();
		
		
		
		// Constructor
		
		public ForSale(String itemDes, double buyItNow, double minBid) {
			this.itemDes = itemDes;
			this.buyItNow = buyItNow;
			this.minBid = minBid;
			cTime = 17005;
			itemNo = 4827;
		}
		
		
		// myBid 
		
		public void myBid(int a, int b, double c, int d) {
			//System.out.println("Hello Welcome to the myBid!");
			String x =  "Bidder No : [" + a + "] Item No : [" + b +"] Bid Amount : [" + c + "] Time : [" + d + "] ";
			if(d > cTime){
			list.add(x);
			}
			
			
		}
		
		// Getters and Setters 
		
		
		public int getItemNo() {
			return itemNo;
		}

		public ArrayList<String> getList() {
			return list;
		}


		public void setList(ArrayList<String> list) {
			this.list = list;
		}


		public int getcTime() {
			return cTime;
		}

		public void setcTime(int cTime) {
			this.cTime = cTime;
		}

		public void setItemNo(int itemNo) {
			this.itemNo = itemNo;
		}
		
		public String getItemDes() {
			return itemDes;
		}
		public void setItemDes(String itemDes) {
			this.itemDes = itemDes;
		}
		public double getBuyItNow() {
			return buyItNow;
		}
		public void setBuyItNow(double buyItNow) {
			this.buyItNow = buyItNow;
		}
		public double getCurrentBid() {
			return currentBid;
		}
		public void setCurrentBid(double currentBid) {
			this.currentBid = currentBid;
		}
		public double getMinBid() {
			return minBid;
		}
		public void setMinBid(double minBid) {
			this.minBid = minBid;
		}
		public double getNewBid() {
			return newBid;
		}
		public void setNewBid(double newBid) {
			this.newBid = newBid;
		}
		
		
	  }
