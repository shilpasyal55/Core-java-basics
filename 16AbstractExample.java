//Abstract Class cannot be instantitated
//used to declare common characteristics of subclass
//Abstract classes can only be extended(used for inheritace)

abstract class Person {
	public String name;
	public int age;
	public void setName(String n){ name = n; }
	public void setAge(int a) { age = a; }

	abstract String show();   //Abstract method has no implementation
}

class Student extends Person {
	String show() {    //implementation of abstract methods is compulsary in child classes
		return "Student Name " + name + " has age " + age;
	}
}

class Faculty extends Person {
	String show() {    //implementation of abstract methods is compulsary in child classes
		return "Teacher Name " + name + " has age " + age;
	}
}

class AbstractExample {
	public static void main(String[] args) {
		// Person p = new Person(); //Error,cannot instantiate
		Student s = new Student();
		s.setName("shilpa");
		s.setAge(24);
		System.out.println(s.show());
	}
}