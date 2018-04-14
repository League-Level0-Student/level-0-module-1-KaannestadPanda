package extra;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class awesomemessage {
	public static void main(String[] args) {
		String password = ("DRTAGON");
		String mess = JOptionPane.showInputDialog(null, "Set your message.");

		String fake = JOptionPane.showInputDialog(null, "Gimme the password or DIE!!!!!");
		if (fake.equals(password)) {
			JOptionPane.showMessageDialog(null, "OK.  The message is \"" + mess + "\", dunno if that helps.");
		} else {
			JOptionPane.showInputDialog(null, "YOU DIE!!!!");
			Robot Aksel = new Robot();

			
			Aksel.penDown();
			Aksel.setSpeed(9001);
			for (int i = 0; i < 1000; i++) {
				Aksel.setRandomPenColor();
				Random Bleh = new Random();
				int x = Bleh.nextInt(50);
				Random Oof = new Random();
				int m = Oof.nextInt(360) - 180;
				Aksel.move(x);
				Aksel.turn(m);
			}
		}

	}
}
