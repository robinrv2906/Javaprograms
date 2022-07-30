package OOP;

public class Stack {// Structure of stack implementation//

	int s[]=new int[10];
	int tos;
	Stack() {
		tos=-1;
	}
	void push(int item) {
		if (tos==9) {
			System.out.println("Sack is Full");
			
		}
		else
		s[++tos]=item;
	}
	int pop() {
		if(tos>=0)
		return s[tos--];
		else
			System.out.println("Stack is Empty");
		return -1;
	}
}
