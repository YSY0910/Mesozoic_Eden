package Collections_Generics;

import java.util.ArrayList;
import java.util.List;

class Crate<T> {
    private List<T> contents;

    public Crate() {
        this.contents = new ArrayList<>();
    }

    public List<T> getContents() {
        return contents;
    }
    
    public void addContent(T content) {
        contents.add(content);
    }
}
    
public class P3 {
	
	public static void main(String[]args) {
		//음식 상자
		Crate<String> foodCrate = new Crate<>();
		Crate<String> jeepCrate = new Crate<>();

	}
}
