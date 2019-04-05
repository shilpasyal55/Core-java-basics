class Multiply{

	public int multiplyBy2(int number) {  //Instance Methods
		return number * 2;
	}

	public static int multiplyBy5(int number) { //Static Methods
		return number * 5;
	}


}

public class Methods {
	public static void main(String[] args) {
		Multiply obj = new Multiply();
		int output = obj.multiplyBy2(9);
		System.out.println("Instance Method " + output);

		int result = Multiply.multiplyBy5(9);
		System.out.println("Class Method " + result);
	}
}