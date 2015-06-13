import javax.swing.JOptionPane;
public class awt {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("en");
		String sn = JOptionPane.showInputDialog("en");
		int n1 = Integer.parseInt(fn);
		int n2 = Integer.parseInt(sn);
		int sum = n1 + n2;
		JOptionPane.showMessageDialog(null, "the sum is " + sum,"the title",JOptionPane.QUESTION_MESSAGE);
	}

}
