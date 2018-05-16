
public class LinkedList {
	private Node head;
	private Node current; // This will have the latest node
	public int count;

	public LinkedList() {
		head = new Node();
		current = head;
	}

	public void addAtStart(Object data) {
		Node newNode = new Node();
		newNode.value = data;
		newNode.next = head.next; // new node will have a reference of the head's next reference
		head.next = newNode; // now the head will refer to the new node
		count++;
	}

	public void removeFromStart() {
		if (count == 1) {
			head = null;
			current = null;
			count = 0;
		} else if (count > 1) {
			head = head.next;
			count--;
		} else {
			System.out.println("There are no elements in the list.");
		}
	}

	public void removeAll(Object o) {
		while (head.next.value == o) {
			removeFromStart();
		}
		Node curr = head;
		Node prev = head;
		while (curr.next != null) {
			prev = curr;
			curr = curr.next;
			if (curr.value == o) {
				prev.next = curr.next;
				count--;
			}
		}
	}

	public void printReverse() {
		Node curr = head;
		int countDown = count;
		int countUp = 1;
		while (countDown > 0) {
			curr = head;
			countUp = 1;
			while (countUp <= countDown) {
				curr = curr.next;
				countUp++;
			}
			System.out.println(curr.value);
			System.out.println("->");

			countDown--;
		}
	}

	public void printAllNodes() {
		System.out.println("Head ->");
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value);
			System.out.println("->");
		}
		System.out.println("NULL");
	}
}
