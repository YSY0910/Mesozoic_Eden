package exception;

class T3AgeException extends Exception{
	T3AgeException(){
		super();
	}
	T3AgeException(String message){
		super(message);
	}
	T3AgeException(Exception e){
		super (e);
	}
}

public class T3Age {
	private int age;
	T3Age(int age){
		this.age = age;
	}
	public void setAge(int age) throws T3AgeException{
		if(age < 0) throw new T3AgeException("Age is must ne over zero.");
		this.age = age;
	}
}
