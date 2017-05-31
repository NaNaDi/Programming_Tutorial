import java.util.ArrayList;


public class Student {
	private String name;
	private int matrNr;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the student a name and a matriculation number
	
	//todo: write getter and setter methods
	
	public Student(String studentName, int number){
		name = studentName;
		matrNr = number;
	}
	
	public void setName(String studentName){
		name = studentName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMatrNr(int number){
		matrNr = number;
	}
	
	public int getMatriNr(){
		return matrNr; 
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
