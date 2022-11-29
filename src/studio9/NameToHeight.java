package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Map<String, Integer> nameHeight = new HashMap<>();
		nameHeight.put("Alex", 180);
		nameHeight.put("Francesca", 150);
		nameHeight.put("Vicky", 150);
		Scanner in = new Scanner(System.in);
		String name = "Start";
		while (!name.equals("quit")) {
			System.out.println("What name?");
			name = in.nextLine();
			if (name.equals("quit")) {
				break;
			}
			else if (nameHeight.get(name)==(null)) {
				System.out.println("This person is not in the list");
			}else {
				int Height = nameHeight.get(name);
				System.out.println(Height);
			}
		
		
		
	}
}
}
