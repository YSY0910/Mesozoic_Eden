package pack06;

enum WorkDay{
	MONDAY("9-5"),
	TUESDAY("9-5"),
	WEDNESDAY("9-5"),
	THIRSDAY("9-5"),
	FRIDAY("9-5"),
	SATURDAY("10-1"){public String getWorkLocation() {return "Home";}
};
	private String hoursOfWork;
	
	WorkDay(String hoursOfWork){
		this.hoursOfWork = hoursOfWork;
	}
	public String getHoursOfWork() {
		return hoursOfWork;
	}
	public String getWorkLocation() {
		return "Office";
	}
}
