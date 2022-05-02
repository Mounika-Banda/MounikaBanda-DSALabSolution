package Question2.Services;

import java.util.*;


public class Question2_Services {

	//Method to check if there is a pair of elements with given sum
	public boolean findPair(Node root, int sum, Stack<Integer> st)
	{
		if (root == null) {
			return false;
		}
		if (findPair(root.left, sum, st)) {
			return true;
		}

		//Prints the pair with given sum
		if (st.contains(sum - root.data))
		{
			System.out.println("Pair is (" + (sum - root.data) + ", "
					+ root.data + ")");
			return true;
		}
		else {
			st.add(root.data);
		}
		return findPair(root.right, sum, st);
	}

	//Method to insert an element in Binary Search Tree
	public Node insertElement(Node root, int ele)
	{

		if (root == null) {
			return new Node(ele);
		}

		//If element is less than root, push it to the left
		if (ele < root.data) {
			root.left = insertElement(root.left, ele);
		}

		//If element is not less than root, push it to the right
		else {
			root.right = insertElement(root.right, ele);
		}

		return root;
	}

}
