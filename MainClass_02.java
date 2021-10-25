package variables01_solution;

public class MainClass_02 {

	public static void main(String[] args) {
		/*Variables
		 * 
		 * Imagine you have a cupboard with a lot of drawers.
		 * In each drawer you can put something.
		 * On each drawer you can put a label saying what is inside the drawer (sugar, salt etc.)
		 * and another label which gives a name to this drawer ("sugar cubes" , "sea salt" etc.)
		 * Such an imaginary "cupboard" is the RAM of the computer.
		 * Each drawer is a cell from the RAM of the computer
		 * 
		 * What are variables - a way to store information in the computer.
		 * Variables can be accessed by the name we give them ("sugar cubes" , "sea salt" etc.)
		 * 
		 * Variable type ==> lets call it label_01 on the drawer, saying what kind of "thing" do we keep inside (sugar, salt etc.)
		 * Variable name ==> lets call it label_02 on the drawer, saying what is the name of the "thing" which we keep inside "sugar cubes" , "sea salt" etc. )
		 * 
		 * To define a variable we must:
		 * 1.Specify the data type - set label_01 (sugar, salt etc.) 
		 * 2.Give the variable a name- set label_02  ("sugar cubes" , "sea salt" etc.)
		 * 
		 * Optionally we can add an expression to set a value for the variable, i.e. to put a real "something" in the drawer
		 * But the mandatory is only the labeling -setting label_01 and label_02 
		 * 
		 * Let's see how this works
		 */
		
		//Declare a variable from type int
		int myVariable_01;
		
		//Declare a variable of type String
		String myVariable_02;
		
		/*
		 * At this stage you cannot print the variable, because it has not been initialized 
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. 
		If you cannot initialize your local variable where it is declared, 
		make sure to assign it a value before you attempt to use it. 
		Accessing an uninitialized local variable will result in a compile-time error.
		*/
		
		//Initializing the variables
		myVariable_01 = 2233;
		myVariable_02 = "Test String Java";
		
		//Now you can output them
		System.out.println("myVariable_01=" + myVariable_01);
		System.out.println("myVariable_02=" + myVariable_02);
		
		
		/*
		 * What are the rules for naming variables:
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
		 * Please read the information about variable names
		 * Here are some:
		 * 1.Allowed symbols to start the name of a variable: a letter, an underscore, dollar-sign
		 * 2.The name can contain digits, but the first symbol cannot be digit
		 * 3.No keyword can be used as a variable name
		 * 4.Variable names are case-sensitive - var_01 is a different name than VAR_01
		 * 5.No spaces, no special characters
		 * 6.Use camelCase if the name of the variable is made of more than one word. 
		 * */
		
		
		int number = 1;
		int _number = 10;
		int $number = 100;
		int number123 = 1000;
		int NUMBER = 10000;//convention -starting with small letter, i.e. this name is discouraged      
		int myNumber = 100000;
		// Printing the values of all variables
		System.out.println("number=" + number);
		System.out.println("_number=" + _number);
		System.out.println("$number=" + $number);
		System.out.println("number123=" + number123);
		System.out.println("NUMBER=" + NUMBER);
		System.out.println("myNumber=" + myNumber);
		
		/*---------------Tasks---------------*/
		
		//Declare an integer variable
		int myVariable01;
		
		//Can you display the variable on the console now? 
		//System.out.println("myVariable01=" + myVariable01); ==> no, it is not initialized
		
		//Initialize the variable with the value 144
		myVariable01 = 144;
		
		
		//Can you display the variable now?
		System.out.println("myVaribale01=" + myVariable01);
			
		//Change the value of myVariable01. Put 222 inside it's "drawer"
		myVariable01 = 222;
		
		//Display the value of myVariable01 on the console
		System.out.println("myVaribale01=" + myVariable01);
		
		//You can also perform some mathematical operations on the variable
		//Add 8 to the variable 
		myVariable01 = myVariable01 + 8;
		
		//Display the value of myVariable01 on the console
		System.out.println("myVaribale01=" + myVariable01);
		
		//Divide the variable with the number 2
		myVariable01 = myVariable01 / 2;
		
		//Display the value of myVariable01 on the console
		System.out.println("myVaribale01=" + myVariable01);
		
		//Subtract 15 from the variable (decrease the value of the variable with 15)
		myVariable01 = myVariable01 - 15;
		
		//Display the value of myVariable01 on the console
		System.out.println("myVaribale01=" + myVariable01);
		
		//Multiply the variable with 4
		myVariable01 = myVariable01 * 4;
		
		
		//Display the value of myVariable01 on the console
		System.out.println("myVaribale01=" + myVariable01);
		
		
		/*
		 * Find a lot of Java-exercises here:
		 * https://www.w3resource.com/java-exercises/ 
		 * 
		 * And also here, with some advanced topics:
		 * https://code-exercises.com/
		 * 
		 */
		
		

	}//main

}//class
