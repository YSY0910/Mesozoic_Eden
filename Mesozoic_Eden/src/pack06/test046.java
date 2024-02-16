package pack06;

public class test046 {

	public static void main(String[] args) {

		//Water stillWater = new Water(); 			// compiler error
		//WATER StillWater = Water.EXTRA_SPARKLING;	// type safety
		
		Water stillWater = Water.STILL;
		System.out.println(stillWater == Water.STILL);
		System.out.println(stillWater.equals(Water.STILL));
		
		switch(stillWater) {
		case STILL:
			System.out.println("Still Water");
			break;
		//case Water.STILL: //case 중복 발생.
		//case 0:  // int 사용 불가
		}
		
		//if(Water.STILL == 0) {} // Water == int
		Water sparklingWater = Water.valueOf("SPARKLING");
		System.out.println(sparklingWater);
		
		for(Water water : Water.values()) {
		// Ordinal value of: 0 is STILL
        //  Ordinal value of: 1 is SPARKLING
			
			
		//valueOf(String) 메서드: enum 상수의 이름이 주어지면, enum 인스턴스를 반환한다.
		//values() 메서드: 모든 enum 상수를 반환한다.
		//ordinal() 메서드: enum 상수 순서 값을 반환한다.  최초의 enum 상수에게 순서값 0이 주어진다
		//name() 메서드: this enum의 이름을 반환한다. name() for STILL은 “STILL”을 반환하고 name() for SPARKLING은 “SPARKLING”을 반환한다.

		System.out.println("Ordinal value of: " + water.ordinal() + " is " + water.name());

		}
	}

}
