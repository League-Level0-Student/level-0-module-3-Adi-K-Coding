package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sign = JOptionPane.showInputDialog("What is your star(zodiac)sign?");
		if (sign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "You will change your name to Jeff sometime in your life.");
		} else if (sign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null,
					"You will like pizza if you don't like it and\nif you do like it, you won't like it anymore.");
		} else if (sign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "You will drink milk later today.");
		} else if (sign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You will fall on the floor.");
		} else if (sign.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "You will get a suprise present.");
		} else if (sign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "You will get 100 percent on the next math test.");
		}else if (sign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Thouest wilts talkest like Shakespear forest a day.");
		}else if (sign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "You will make someone happy.");
		}else if (sign.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "You will make someone sad.");
		}else if (sign.equalsIgnoreCase("CAPricoRn")) {
			JOptionPane.showInputDialog( "You will say something random(type in something random)");
		JOptionPane.showMessageDialog(null, "Wow, that was random");
		} else if (sign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "You will drink a cup of water");
		}else if (sign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "You will get your first friend.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Thats not a star sign!");
		}

	}

}
