class Car {
	private int speed; 
    public int wheels;
    /*these methods can access and modify the private variable
    because they are within its class */
    public Car(int carSpeed) { 
        speed = carSpeed; 
        wheels = 4;
    }  
    //this public method is a 'getter', it returns the value contained in a private variable
    public int getSpeed() { 
        return speed;
    }
    public void carBrake(int slow) { 
        speed -= slow; 
    }
}

public class AccessSpecifier {
	public static void main(String[] args) {
		Car honda = new Car(80);
		//wheels is a public variable, so it can be accessed directly outside the class itself
		System.out.println("Car wheels:  " + honda.wheels);
		//Speed is a private variable, so it cannot be accessed directly
		// System.out.println("Speed: " + honda.speed); //will not compile
		//Instead, a public method within the class is used to access the variable's value
		System.out.println("Speed: " + honda.getSpeed()); //will compile
		honda.carBrake(10);
		System.out.println("Speed: " + honda.getSpeed()); //will compile
	}
}