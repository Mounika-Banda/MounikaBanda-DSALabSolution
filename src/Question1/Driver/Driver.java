package Question1.Driver;

import Question1.Services.CheckBalanceBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hard-coded Input
		String str="([[{}]])";
		//Convert string to Char Array
		char[] charArray = str.toCharArray();
		//Create an object for CheckBalanceBrackets Class
		CheckBalanceBrackets cb = new CheckBalanceBrackets();
		//Calling the method to check if it is balanced brackets or not
		cb.checkIfBalanced(charArray);

	}

}
