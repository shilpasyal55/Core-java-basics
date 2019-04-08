//Method declaration are implicitly public and abstract
//Fields are implicitly public static final
//Interface donot have constructors

interface Calculation {
	double PI = 3.14;    
	int add(int a,int b);   
	int sub(int a,int b);
}

class MathExample implements Calculation {
	public int add(int a,int b) {  //you need to assign public modifier in order to override
		return a + b + 10;
	}
	public int sub(int a,int b) {
		return a - b;
	}
	double getPI() {
		return PI;
	}
}
class InterfaceExample {
	public static void main(String[] args) {
		MathExample obj = new MathExample();
		System.out.println(obj.add(1,2));
		System.out.println(obj.getPI());
	}
}

