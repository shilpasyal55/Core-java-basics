//Method Overriding
//Method Overloading

class A {
	void func1(int a,int b) {
		System.out.println(a + b);
	}

	void func1(String a,String b,String c) {  //method overloading
		System.out.println(a + b + c);
	}

	int func2(int a) {
		return a;
	}
}
class B extends A{ 
	int func2(int a) {   //overrides parent method func2
		return a*2;
	} 
}
class MethodOverloading {
	public static void main(String[] args) {
		A obj = new A();
		obj.func1(2,3);
		obj.func1("Shilpa","Syal","developer");
		B obj1 = new B();
		System.out.println(obj1.func2(8));
	}
}