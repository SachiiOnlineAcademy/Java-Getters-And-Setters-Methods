import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	String name = "";
	String surname = "";
	String id = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentDetails();
	}
	//Setter Methods
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	// Getter Methods
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getId() {
		return this.id;
	}
	
	public static void studentDetails() {
		Scanner input = new Scanner(System.in);
		Student s = new Student();
		//Name
		System.out.println("Enter Student name: ");
		s.setName(input.next());
		//Surname
		System.out.println("Enter Student Surname: ");
		s.setSurname(input.next());
		//Id
		System.out.println("Enter Student Id: ");
		s.setId(input.next());
		System.out.println("Student Details: ");
		System.out.println("=========================");
		System.out.println("Name: "+s.getName());
		System.out.println("Surname: "+s.getSurname());
		System.out.println("Id: "+s.getId());
		System.out.println("=========================");
		
	}

}
