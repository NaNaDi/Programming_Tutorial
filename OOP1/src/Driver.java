
public class Driver {
	
	public static void main(String[] args) {
		//todo: create at least 1 student, 1 professor and one lecture
		
		Professor professorOne = new Professor("John Bohn", "Mobile Information Systems");
		Student studentOne = new Student("Karl Hey", 12345);
		Lecture lectureOne = new Lecture("Mobile Information Systems", 4.0);
		
		// add the lecture to the student and the professor
		
		studentOne.addLecture(lectureOne.getName());
		professorOne.addLecture(lectureOne.getName());
		
		System.out.println("Professor name: "+professorOne.getName());
		System.out.println("Professor chair: "+professorOne.getChair());
		System.out.println("Professor lectures: ");
		professorOne.getLectures();
		
		System.out.println("Student name: "+studentOne.getName());
		System.out.println("Student number: "+studentOne.getMatriNr());
		System.out.println("Student lectures: ");
		studentOne.getLectures();
		
	}
}
