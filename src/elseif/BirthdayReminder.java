
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "June 20th";
		String dadsBirthday = "June 10th";
		String myBirthday = "June 2nd";
		String brothersBirthday = "May 16";
		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String who = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, "You chose " + who);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (who.equalsIgnoreCase("mom") || (who.equalsIgnoreCase("mother"))) {
			JOptionPane.showMessageDialog(null, "Her birthday is " + momsBirthday);
		} else if (who.equalsIgnoreCase("dad") || (who.equalsIgnoreCase("father"))) {
			JOptionPane.showMessageDialog(null, "His birthday is " + dadsBirthday);
		} else if (who.equalsIgnoreCase("brother")) {
			JOptionPane.showMessageDialog(null, "Hir birthday is " + brothersBirthday);
		} else if (who.equalsIgnoreCase("me") || (who.equalsIgnoreCase("meh"))) {
			JOptionPane.showMessageDialog(null, "Your birthday is " + myBirthday);
		}else {
			JOptionPane.showMessageDialog(null, "Sorry, I dont remember that persons birthday.");
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
