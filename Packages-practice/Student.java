package student;

public class Student {
	String name;
	int roll_no;

	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getInfo() {
		return this.name + " has roll no. " + this.roll_no;
	}
}