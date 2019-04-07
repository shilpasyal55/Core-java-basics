//When you have many constructors and want some common code to be executed
//for each constructor you can use instance initializer.
//As it is called for all constructors.
//Two types of initialization block
//1)Instance Initialization block
//2)Static Initialization block

class InitializationBlock {
	int speed;
	static String color;
	{
		speed = 70;  //Instance Initialization block runs for every object
	}

	static
	{
		color = "White"; //Static Initialization block runs only once
	}


	InitializationBlock() {
		System.out.println(speed);
		System.out.println(color);
	}

	public static void main(String[] args) {
		InitializationBlock obj = new InitializationBlock();
	}
}
