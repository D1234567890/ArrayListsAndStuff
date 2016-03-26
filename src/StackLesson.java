import java.util.Stack;

public class StackLesson {
	public static void main(String[] args) {
		Stack<Integer> numberStack = new Stack<Integer>();
		numberStack.push(67);
		numberStack.push(42);
		numberStack.push(35);
		numberStack.push(96);
		int stackSize = numberStack.size();
		for (int i = 0; i < stackSize; i++) {
			System.out.println(numberStack.pop());
		}
	}
}