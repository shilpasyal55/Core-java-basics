package main;
import student.Student;

public class Main {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Shilpa");
		obj.setRollNo(56);
		System.out.println(obj.getInfo());
	}
}
