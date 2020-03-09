import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {

		new Main();

	}

	public Main() {

		deques();

	}

	public void deques() {

		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Amilcar");
		deque.add("Ken");
		deque.add("Graham");
		deque.add("Michael");
		deque.add("Lorena");

		System.out.println(deque);
		deque.remove();
		deque.removeLast();
		System.out.println(deque);

		deque.addFirst("Ricky Martin");
		System.out.println(deque);
	}

	public void personDeque() {

		Deque<Person> deque = new ArrayDeque<Person>();
		deque.add(new Person("Amilcar"));
		deque.add(new Person("Ken"));
		deque.add(new Person("Graham"));
		deque.add(new Person("Michael"));
		deque.add(new Person("Lorena"));
	}
}
