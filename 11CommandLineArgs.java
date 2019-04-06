public class CommandLineArgs {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length ; i++ ) {
			// sum = sum + args[i]; //will not work as args type is string
			sum = sum + Integer.parseInt(args[i]); //convert string to integer
		}
		System.out.println(sum);
	}
}