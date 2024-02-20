package pack07;

import java.util.*;

class Employee{
	private int empID;
	private String name;
	Employee(int empID, String name){
		this.empID = empID;
		this.name = name;
	}
	@Override public String toString() {return "ID: " + empID + ", " + "Name: " + name + ", ";}
}
class Manager extends Employee{
	private String deptName;
	Manager(int empID, String name, String deptName){
		super(empID, name);
		this.deptName = deptName;
	}
	@Override public String toString() {
		return super.toString() + "Deptment: " + deptName + ", ";
	}
}
class Director extends Manager{
	private double budget;
	Director(int empID, String name, String deptName, double budget){
		super(empID, name, deptName);
		this.budget = budget;
	}
	@Override public String toString() {return super.toString() + " budget " + budget + ", ";}
}
class Rate extends Director{
	private String rate;
	Rate(int empID, String name, String deptName, double budget, String rate){
		super(empID, name, deptName, budget);
		this.rate = rate;
	}
	@Override public String toString() {return super.toString() + "rate: " + rate;}
}

public class test003{

	public static void main(String[]args){
	//boolean keepType = false;
	
	Scanner sc = new Scanner(System.in);
	//do {
	System.out.println("직원 번호 입력: ");
	int empID = sc.nextInt();
	
	System.out.println("이름 입력: ");
	String name = sc.next();
	
	System.out.println("부서 입력: ");	
	String deptName = sc.next();		
	
	System.out.println("예산 입력: ");
	double budget = sc.nextDouble();
	
	System.out.println("접근 등급 입력: ");
	String rate = sc.next();
	
	Employee emp = new Rate(empID, name, deptName, budget, rate);
    System.out.println(emp);
    //System.out.println("계속 할까요?: 네/아니오 ");
	//	}(keepType);
	}
}
/*
public class test003 {
	public static void main(String[]args) {
		Employee emplDir = new Rate(754, "이스마엘", "마케팅", 10_000.00, "A");
		System.out.println(emplDir);
	}
}
*/