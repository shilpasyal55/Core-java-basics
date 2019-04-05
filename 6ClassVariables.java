//Class variables are tied to the class itself,
// and its value is shared across all class objects.

class Car {
	//Class Variable
	public static int numberOfWheels = 4; //all cars have 4 wheels
	private static String color = "blue";
	//Instance Variable
	public int model = 2015;

	public  int getModel() {
		//static int a = 5;  //Error,cannot declare static variables inside the function
		int a = this.model;  //Error,cannot declare static variables inside the function
		return a;
	}

	public static String getColor() {
		// return this.model;   //Error ,static functin can only access static variables
		return color;
	}

}

 class ClassVariables {
	public static void main(String[] args) {
		//no need to create object to access static variables
	
		System.out.println(Car.numberOfWheels);  

		//Instance variables can only be accessed by class objects
		Car obj1 = new Car();
		System.out.println(obj1.model);

		//System.out.println(Car.model); //will give error

		System.out.println(Car.getColor()); //Access private variables using public function
} 
}