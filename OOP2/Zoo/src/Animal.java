import java.util.Date;

public abstract class Animal {
	
	protected String name;
	protected Date birthday;
	protected boolean isFemale;
	
	protected abstract void saySomething();
	
	protected String getName(){
		return name;
	}
	
	protected Date getBirthday(){
		return birthday;
	}
	
	protected String getGender(){
		if(isFemale)
			return "Female";
		else
			return "Male";
	}
	
}
