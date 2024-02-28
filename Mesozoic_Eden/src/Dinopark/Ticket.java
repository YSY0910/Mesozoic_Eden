package Dinopark;

class Ticket{
	private int price;
	private String visitorName;
	private int visitDate;
	boolean VIP;
	
	Ticket(int price, String visitorName, int visitDate, boolean VIP){
		this.price = price;
		this.visitorName = visitorName;
		this.visitDate = visitDate;
		this.VIP = VIP;
		}
	public int getPrice() {
		return price;
	}
	public void setPrice(int aPrice) {
		price = aPrice;
	}
	public String getVisitorName() {
		return visitorName;
	}
	public void setVisitorName(String aVisitorName) {
		visitorName = aVisitorName;
	}
	public int getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(int aVisitDate) {
		visitDate = aVisitDate;
	}
	public boolean getVip() {
		return VIP;
	}
	public void setVip(boolean aVIP) {
		VIP = aVIP;
	}
}

class SeasonTicket extends Ticket{
	private int startDate;
	private int endDate;
	SeasonTicket(int price, String visitorName, int visitDate, boolean VIP, int startDate, int endDate){
		super(price, visitorName, visitDate, VIP);
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getStartDate() {
		return startDate;
	}
	public int getEndDate() {
		return endDate;
	}
	public void setStartDate(int aStartDate) {
		startDate = aStartDate;
	}
	public void setEndDate(int aEndDate) {
		endDate = aEndDate;
	}
}
