package extras;

import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obidient_Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obidient_Robot bob = new obidient_Robot();
		bob.dostuff();
	}

	void square(Robot somewhatnew) {
		for (int i = 0; i < 4; i++) {
			somewhatnew.hide();
			somewhatnew.penDown();
			somewhatnew.setSpeed(100);
			somewhatnew.move(150);
			somewhatnew.turn(90);
		}
	}

	void triangle(Robot somewhatnew) {
		for (int i = 0; i < 3; i++) {
			somewhatnew.hide();
			somewhatnew.penDown();
			somewhatnew.setSpeed(100);
			somewhatnew.move(150);
			somewhatnew.turn(120);
		}
	}

	void circle(Robot somewhatnew) {
		for (int i = 0; i < 720; i++) {
			somewhatnew.hide();
			somewhatnew.penDown();
			somewhatnew.setSpeed(100);
			somewhatnew.move(1);
			somewhatnew.turn(1);
		}
	}

	void dostuff() {
		String whatshape = JOptionPane.showInputDialog("What shape do you want to draw?");
		Robot jim = new Robot();
		if (whatshape.equalsIgnoreCase("square")) {
			square(jim);
		} else if (whatshape.equalsIgnoreCase("triangle")) {
			triangle(jim);
		} else if (whatshape.equalsIgnoreCase("circle")) {
			circle(jim);
		}else {
			JOptionPane.showMessageDialog(null, "That's not a shape I recognize.");
		}
	}
}
