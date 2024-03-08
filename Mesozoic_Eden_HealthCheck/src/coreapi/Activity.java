package coreapi;
import java.time.*;

public class Activity{
	private String name;
	private LocalDate date;
	private Dinosaur dinosaur;
	
	public Activity(String name, LocalDate date, Dinosaur dinosaur){
		this.name = name;
		this.date = date;
		this.dinosaur = dinosaur;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDate() {
		return date;
	}
	public Dinosaur getDinosaur() {
		return dinosaur;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setDinosaur(Dinosaur dinosaur) {
		this.dinosaur = dinosaur;
	}
}
