import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		
		Date date = new Date();
		Lion lion = new Lion("Simba", date , false);
		Pig pig = new Pig("Pig", date, true);
		
		/*
		 * Lion Tests
		 */
		
		System.out.println("****LION****");
		System.out.println("Lion name: "+lion.getName());
		System.out.println("Gender: "+lion.getGender());
		System.out.println("Birthday: "+lion.getBirthday());
		
		/*
		 * Pig testes
		 */
		
		System.out.println("\n****PIG****");
		System.out.println("Pig name: "+pig.getName());
		System.out.println("Gender: "+pig.getGender());
		System.out.println("Birthday: "+pig.getBirthday());
	}
}
