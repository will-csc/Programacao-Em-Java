import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("Enter your name: \n");
		JOptionPane.showMessageDialog(null,"Hello "+name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: \n"));
		JOptionPane.showMessageDialog(null,"You are "+age+" years old");

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: \n"));
		JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");

	}
}
