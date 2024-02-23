package pack10;

class Machine{
	void on() {System.out.println("Machine::on");}
}
class Tractor extends Machine{
	@Override void on() {System.out.println("Tractor::on");}
}
public class test2 {
	public static void doAction(Machine machine) {
		machine.on();
	}
	public static void main(String[]args) {
		Machine mt = new Tractor();
		doAction(mt);
		doAction(new Tractor());
		System.out.println();
		Machine ms = new Machine();
		doAction(ms);
		doAction(new Tractor());
		doAction(new Machine());
	}
}
