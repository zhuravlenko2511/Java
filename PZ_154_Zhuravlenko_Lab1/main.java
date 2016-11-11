import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class main {
    public static void main(String[] args) {
		JFrame form = new JFrame("PZ_154_Zhuravlenko_Lab1");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setVisible(true);
		
		JButton button = new JButton("Result");
		JTextField string1 = new JTextField();
		JTextField string2 = new JTextField();
		JTextField result = new JTextField();
		GridLayout grid = new GridLayout(4, 0);
		
		form.setLayout(grid);
		button.setBackground(Color.RED);
		
		form.getContentPane().add(string1);
		form.getContentPane().add(string2);
		form.getContentPane().add(button);
		form.getContentPane().add(result);
		
		form.setSize(400, 300);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1, str2, res;
				str1 = string1.getText();
				str2 = string2.getText();
				res = new String();
				int length;
				if (str1.length() == str2.length()) {
					button.setBackground(Color.GREEN);
					length = str1.length();
					for (int i = 0; i < length; i++) {
						res += Character.toString(str1.charAt(i)) + Character.toString(str2.charAt(i));
					}
					result.setText(res);
				}
				else {
					button.setBackground(Color.RED);
					result.setText("length string1 != length string2");
				}
			}
		}
		);
    }
}