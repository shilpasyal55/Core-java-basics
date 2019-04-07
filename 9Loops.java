private class ForLoop {
	void executeForLoop() {
		for (int i = 0; i < 10 ; i ++) {
			System.out.println(i);
		}
	}
}
class ForEachLoop {
	int[] marks = {25,78,56,12,10};

	void executeForEachLoop() {
		for (int mark : marks) {
			System.out.println(mark);
		}
	}
}
class WhileLoop {
	void executeWhileLoop() {
		int x = 0; 
		while(x < 10) { 
		    System.out.println(x); //prints x until x < 10 evaluates to false
			x++; 
		}
	}
}
class DoWhileLoop {
	void executeDoWhileLoop() {
		int x = 0; 
			do { 
			    System.out.println(x); 
			    x++; 
			} while(x < 10);
	}
}

class BreakContinue {
//break statement moves out of the loop 
	 void executeBreak() {
	 	for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
		}
	 }
// The continue statement breaks one iteration (in the loop), 
//if a specified condition occurs, and continues with the next iteration in the loop.


	 void executeContinue() {
	 	for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    continue;
		  }
		  System.out.println(i);
		}
	 }
}




public class Loops {
	public static void main(String[] args) {
		ForLoop obj = new ForLoop();
		obj.executeForLoop();
		ForEachLoop obj1 = new ForEachLoop();
		obj1.executeForEachLoop();
		WhileLoop obj2 = new WhileLoop();
		obj2.executeWhileLoop();
		DoWhileLoop obj3 = new DoWhileLoop();
		obj3.executeDoWhileLoop();
		BreakContinue  obj4 = new BreakContinue();
		obj4.executeContinue();
	}
}