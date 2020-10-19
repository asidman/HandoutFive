import acm.program.*;
import java.util.*;

public class UniqueNames extends ConsoleProgram {
	public void run() {
		ArrayList<String> names = new ArrayList<String>();
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals(""))
				break;
			if (!names.contains(name)) {
				names.add(name);
			}
		}

		println("Unique name list contains:");
		printList(names);
	}

	private void printList(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}

}