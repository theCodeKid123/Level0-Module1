package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("When's your birthday");
	if (input.equals("3/11")) {
		JOptionPane.showMessageDialog(null, "happy Birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "merry un-birthday");
		}
	}
}
