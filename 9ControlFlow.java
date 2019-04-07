//IF STATEMENT
class IfStatement {
	public void executeIf(int counter) {
		if(counter >= 50) { 
	    	System.out.print("Counter is greater than or equal to 50.");
		} 
		else if (counter > 30) { 
		    System.out.print("Counter is greater than 30."); 
		} 
		else { 
		   System.out.println("Counter is less than 30");
		}
}}
class SwitchStatement {
	String color = "red";
	public void executeSwitch() {
		switch(color) {
			case "red" :
				System.out.println("Red Color");
				break;
			case "blue":
				System.out.println("Blue Color");
				break;
			default:
				System.out.println("Random Color");
}}}
class TernaryStatement {
	int findMaximum(int a, int b){
      //if a > b, it returns a, if not it returns b
	    return (a > b) ? a : b;
	}
}

public class ControlFlow {
	public static void main(String[] args) {
		IfStatement obj = new IfStatement();
		obj.executeIf(10);
		SwitchStatement obj1 = new SwitchStatement();
		obj1.executeSwitch();
		TernaryStatement obj2 = new TernaryStatement();
		System.out.println(obj2.findMaximum(5,9));
	}
}