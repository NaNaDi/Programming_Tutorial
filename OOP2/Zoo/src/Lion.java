import java.util.Date;

public class Lion extends Animal implements Predator {
	
	Lion(String name, Date birthday, boolean isFemale){
		super.name = name;
		super.birthday = birthday;
		super.isFemale = isFemale;
	}
	
	
	@Override
	public void saySomething() {
		System.out.println("Grrrrrrrrrrrrrrrrr");
	}

	@Override
	public void warningPlate() {
		System.out.println("I'm here! Try to run if you can!");
	}

}
