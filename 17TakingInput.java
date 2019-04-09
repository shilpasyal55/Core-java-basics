//Taking input using Scanner class

import java.util.*;

class TakingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email");
		String email = sc.next();

		// Skip the newline
		sc.nextLine();
		System.out.println("Enter you name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();

		System.out.println("Email is " + email);
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}

}