
public class MainApp {

	public static void main(String[] args) {
		// List list = new List(); // example number 1 using array under the hood
		//
		// list.insert("Grand Circus");
		// list.insert("Park");
		//
		// System.out.println(list);
		// System.out.println(list.isFull());
		// System.out.println(list.isEmpty());

		// Example # 2
		LinkedList list2 = new LinkedList();
		list2.addAtStart("Abby");
		list2.addAtStart("Betsy");
		list2.addAtStart("Caleb");
		list2.addAtStart("David");
		list2.addAtStart("Elaine");
		list2.addAtStart("Franny");
		list2.addAtStart("Georgia");
		list2.addAtStart("Hannah");
		list2.addAtStart("Irene");
		list2.addAtStart("Jonah");
		list2.addAtStart("Karen");
		list2.addAtStart("Lois");

		list2.printAllNodes();

		// list2.removeFromStart();

		// // Node testNode = new Node;
		// list2.removeAll("Jonah");
		// System.out.println("Separator");
		// list2.printAllNodes();

		list2.printReverse();
	}

}
