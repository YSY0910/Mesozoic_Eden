package dinosaur;

class Ticket{
	private int price;
	private String visitorName;
	private int visitDate;
	
	Ticket(int price, String visitorName, int visitDate){
		this.price = price;
		this.visitorName = visitorName;
		this.visitDate = visitDate;
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
	public int getVsisitDate() {
		return visitDate;
	}
	public void setVisitDate(int aVisitDate) {
		visitDate = aVisitDate;
	}
}
