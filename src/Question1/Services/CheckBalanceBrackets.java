package Question1.Services;

//Importing it to use stack
import java.util.*;

public class CheckBalanceBrackets {

	//Method to check if brackets are balanced or not
	public void checkIfBalanced(char arr[]) {

		char x, y;
		//Declaration of Stack
		Stack<Object> st = new Stack<>();
		boolean flag = true;

		//Traversing through the char Array
		for (int i = 0; i < arr.length; i++) {
			x = arr[i];

			if (x == '(' || x == '{' || x == '[') {
				//Push the element into stack if it's opening bracket
				st.push(x);
				continue;
			}

			if (st.isEmpty()) {
				System.out.println("The entered Strings do not contain Balanced Brackets");
				return;
			}

			y = (char) st.pop();
			if (x == '}') {
				if (y == '{')
					continue;
				else {
					flag = false;
					break;
				}
			}
			if (x == ')') {
				if (y == '(')
					continue;
				else {
					flag = false;
					break;
				}
			}
			if (x == ']') {
				if (y == '[')
					continue;
				else {
					flag = false;
					break;
				}
			}


		}

		if (flag)
			if (st.isEmpty())
				System.out.println("The entered String has Balanced Brackets");
			else
				System.out.println("The entered Strings do not contain Balanced Brackets");

	}
}




