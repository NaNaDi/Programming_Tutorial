import java.util.*;
public class BasicsArrayList {
//beginner
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList
	
public static List addlist(List l, int x) {
	Integer y = new Integer(x); 
	l.add(y);
	return l;
}

public static void prlist(List l) {
	for (Object o: l) {
		System.out.println(o);
	}
}

public static void main(String[] args) {
	List list = new ArrayList();
	Integer i = new Integer(5);
	Integer j = new Integer(8);
	list.add(i);
	list.add(j);
	addlist(list, 10);
	prlist(list);
}
}
