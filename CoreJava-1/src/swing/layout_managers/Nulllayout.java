package swing.layout_managers;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Nulllayout {
	JFrame frame;

	JLabel lbl_1;
	JTextField txt_1;
	
	public Nulllayout () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(200, 225));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		lbl_1 = new JLabel("ID : ");
		lbl_1 .setBounds(20, 20, 50, 20);
		
		txt_1 = new JTextField(15);
		txt_1 .setBounds(45, 20, 50, 20);
		
		frame.setLayout(null);
		
		frame.add(lbl_1);
		
		frame.add(txt_1);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Nulllayout();
	}
}
