
public class Lecture {
	private String name;
	private double credits;
	
	//todo: write a constructor which already takes a name and credits
	
	public Lecture(String lectureName, double lectureCredits){
		name = lectureName;
		credits = lectureCredits;
	}
	
	//todo: write getter and setter methods
	
	public void setName(String lectureName){
		name = lectureName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCredits(double lectureCredits){
		credits = lectureCredits;
	}
	
	public double getCredits(){
		return credits;
	}
	
}
