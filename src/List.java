import java.util.Arrays;

public class List {

	private String[] items = new String[100];
	private int count = 0;

	public int length() {
		return count;
	}

	public boolean isEmpty() {
		// if (count == 0) {
		// return true;
		// }
		//
		// ternary operator - shorthand code for an if else statement
		// condition ? true : false;
		boolean check = count == 0 ? true : false;
		return check;
		// return count == 0 ? true : false;
	}

	public boolean isFull() {
		if (count == items.length) {
			return true;
		}
		return false;
	}

	public boolean insert(String newItem) {
		if (count == items.length) {
			return false;
		}
		items[count] = newItem;
		count++;
		return true;
	}

	@Override
	public String toString() {
		return "List [items=" + Arrays.toString(items) + "]";
	}

}
