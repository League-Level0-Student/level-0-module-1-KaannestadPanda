package extra;

import javax.swing.JOptionPane;

public class awesomemessage {
	public static void main(String[] args) {
		String password=("DRTAGON");
		String mess=JOptionPane.showInputDialog(null, "Set your message.");
		
		
		
		
		
		String fake=JOptionPane.showInputDialog(null, "Gimme the password or DIE!!!!!");
		if (fake.equals(password)) {
			JOptionPane.showMessageDialog(null, "OK.  The message is \""+mess+ "\", dunno if that helps.");
		}
		
		
		
		
		
		
		
	}
}
