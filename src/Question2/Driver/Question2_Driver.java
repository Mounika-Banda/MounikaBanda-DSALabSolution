package Question2.Driver;

import java.util.*;

import Question2.Services.Node;
import Question2.Services.Question2_Services;

public class Question2_Driver {

	public static void main(String[] args) {

		//Hard coded input for BST and sum
		int[] bstData = {40,20,10,30,60,50,70};
		int sum = 130;

		//Create an object for Question2_Services class
		Question2_Services qs = new Question2_Services();

		Node root = null;

		//Traversing through BST
		for (int i: bstData) 
			root = qs.insertElement(root, i); 

		//Declaration of Stack
		Stack<Integer> st = new Stack<>();

		//Calling the method to check if pair is foound or not
		if (!qs.findPair(root, sum, st)) {
			System.out.println("Nodes are not found");
		}

	}

}
