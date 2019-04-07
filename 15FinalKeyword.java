//Final variables are constants,the can only be assigned once.
//If we don't initiliaze the final variable during declaration, 
//then it is known as blank final variable
//you can initialize blank variable either in constructor or initialization block
final class FinalClass {  //final class cannot be inherited

}
public class FinalKeyword {
	public final int x;  //final instance member variable
	public static int y;   //final static variable

	FinalKeyword() { //or use initialization block to assign value to final instance variable
		x= 5;
	}

	static
	{
		y = 9;  //static final variable can only be initialized during declaration or
				//using static block
	}

	public void func1() {
		final int a;  //local variables must be initialized before use
					   //they are not assigned default values
		System.out.println(a);
	}

	final void func2() { }//final methods cannot be overriden
	public static void main(String[] args) {
		FinalKeyword e1 = new FinalKeyword();
		System.out.println(e1.x);
		System.out.println(FinalKeyword.y);
		e1.func1();
	}
}
