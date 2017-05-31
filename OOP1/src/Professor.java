import java.util.ArrayList;


public class Professor {
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the student a name and a chair
	
	public Professor(String professorName, String professorChair){
		name = professorName;
		chair = professorChair;
	}
	
	//todo: write getter and setter methods
	
	public void setName(String professorName){
		name = professorName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setChair(String professorChair){
		chair = professorChair;
	}
	
	public String getChair(){
		return chair;
	}
	
	public void addLecture(String lecture){
		//todo: fill this method
		lectures.add(lecture);
	}
	
	public void getLectures(){
		for (Object lecture : lectures) {
			System.out.println(lecture.toString());
		}
	}
	
}
