//int [][]a = new int[][5] //error
//int [][]a = new int[4][] //correct

class TwoDimensionalArray {
	public static void main(String[] args) {
		//int [][]arr = new int[4][];

		//System.out.println(arr[0][0]); //Null pointer Exception

		// declaring and initializing 2D array 
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };   
        // printing 2D array 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) 
             {
             	System.out.print(arr[i][j] + " "); 
  			 }
            System.out.println(); 
        } 

        //Example of saving Students marks in 2d array

        int studentsmarks[][];
        studentsmarks = new int[3][4];  //Storing marks of 4 subjects of 3 students
        studentsmarks[0][0] = 29; //first student,subject 1st 
        studentsmarks[0][1] = 10; //first student, subject 2nd marks
        studentsmarks[0][2] = 30;
        studentsmarks[1][1] = 42; //second student, subject 2nd
        studentsmarks[2][2] = 26; //third student,subject 3rd

        System.out.println("Student 1 obtains subject 2 marks " + studentsmarks[0][1]);
    } 
}