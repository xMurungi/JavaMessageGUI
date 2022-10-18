package program2;

import javax.swing.JOptionPane;

public class program {

	public static void main(String[] args) {
		
		//shows input dialog and a message
		String name= JOptionPane.showInputDialog(null, "Enter your name");
		//shows a message dialog of text you input
		JOptionPane.showMessageDialog(null,"Hi, your name is "+name);
		
		 //Integer=wrapper class... parseInt method that converts string from show input dialog to an integer stored in variable age
		int age=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
		JOptionPane.showMessageDialog(null,"Hello, you are "+age+" years old");
		
		double height=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height "+name));
		JOptionPane.showMessageDialog(null,"You are "+height+" cm tall!");
		JOptionPane.showMessageDialog(null,"Hello "+name+". You are "+age+". Congratulations for turning "+age+". " +height+" cm is a really nice height. Success. LOVE UNIVERSE.");
	}
	
}
