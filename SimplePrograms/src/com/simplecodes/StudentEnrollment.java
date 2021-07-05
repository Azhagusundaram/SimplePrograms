package com.simplecodes;
import java.util.Scanner;
class Student{
	String name;
	String id;
	Scanner scan=new Scanner(System.in);
	public void name() {
		System.out.println("Enter the Name");
		name=scan.nextLine();
	}
	public void id() {
		System.out.println("Enter the ID");
		id=scan.nextLine();
	}
	public String getname() {
		return name;
	}
	public String getid() {
		return id;
	}
}
public class StudentEnrollment {
	public static void main(String[] args) {
		Student Student1 =new Student();
		Student Student2 =new Student();
		Student1.name();
		Student1.id();
		Student2.name();
		Student2.id();
		System.out.println(Student1.getname()+" "+Student1.getid());
		System.out.println(Student2.getname()+" "+Student2.getid());
	}
}
