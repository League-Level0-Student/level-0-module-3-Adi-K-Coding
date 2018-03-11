package loops;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String areyouhappy = JOptionPane.showInputDialog("Are you Happy?");
		if (areyouhappy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
		} else {
			String doyouwanttobehappy = JOptionPane.showInputDialog("Do you want to be happy?");
			if (doyouwanttobehappy.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
			}
		}
	}

}
