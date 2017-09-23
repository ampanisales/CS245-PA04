//@Author: Anthony Panisales

public class ArrayStack implements Stack {

	private int top; //Place where we add to stack
	private Object[] arr;

	public ArrayStack() {
		top = 0;
		arr = new Object[10];
	}

	public void push(Object item) {
		/*Check that top is not greater than arr.length. If it is
		that means that the array is full*/
		if (top >= arr.length) {
			growStack();
		}
		arr[top++] = item; //Increment top after you place the new top
	}

	public Object pop() {
		if (empty()) {
			return null;
		}
		return arr[--top]; //Decrement top first, then take the value top and use it
	}

	public Object peek() {
		if (empty()) {
			return null;
		}
		return arr[top - 1]; //Does not decrement top
	}

	public boolean empty() {
		if (top == 0) {
			return true;
		}
		return false;
	}

	public void growStack() {
		Object[] newArr = new Object[2 * arr.length];

		System.arraycopy(arr, 0, newArr, 0, arr.length);
		arr = newArr;
	}
}