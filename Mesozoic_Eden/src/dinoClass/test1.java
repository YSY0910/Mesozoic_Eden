package dinoClass;

public class test1{
	public static void main(String[]args) {
	Dinosaur dino1 = new WalkingDino("티노", 15, "티라노사우루스", "지상", "육식");
	Dinosaur dino2 = new FlyingDino("케찰", 15, "케찰코아틀", "둥지", "잡식");
	Dinosaur dino3 = new AquaDino("모사", 15, "모사사우루스", "몰속", "육식");
	Dinosaur[] dinosaurs = new Dinosaur[3];
	dinosaurs[0] = dino1;
	dinosaurs[1] = dino2;
	dinosaurs[2] = dino3;
	
	for(int i = 0; i < dinosaurs.length; i++) {
		System.out.println(dinosaurs[i]);
	}
	ParkStaff Staff1 = new Security("이스마엘", 30, "보안팀장", 10);
	ParkStaff Staff2 = new Veterinarians("파우스트", 28, "수의팀장", 8);
	ParkStaff Staff3 = new Guide("로쟈", 31, "안내팀장", 7);
	ParkStaff[] staffs = new ParkStaff[3];
	staffs[0] = Staff1;
	staffs[1] = Staff2;
	staffs[2] = Staff3;
	
	for(int i = 0; i < staffs.length; i++) {
		System.out.println(staffs[i]);
	}
	}
	
	
}
