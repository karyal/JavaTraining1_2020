package jdbc;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JDBC_GUI_1 implements ActionListener{
	JFrame frame;
	JLabel lbl_1, lbl_2,lbl_3,lbl_4,lbl_5;
	JTextField txt_1, txt_2,txt_3,txt_4,txt_5;
	JButton btn_save, btn_close;
	
	public JDBC_GUI_1() {
		frame = new JFrame("JDBC-DEMO");
		frame.setSize(new Dimension(250, 320));
		frame.setResizable(false);
		
		lbl_1 = new JLabel("SN : ");
		lbl_2 = new JLabel("NAME : ");
		lbl_3 = new JLabel("ADDRESS : ");
		lbl_4 = new JLabel("EMAIL : ");
		lbl_5 = new JLabel("PHONE : ");
		
		txt_1 = new JTextField(20);
		txt_2 = new JTextField(20);
		txt_3 = new JTextField(20);
		txt_4 = new JTextField(20);
		txt_5 = new JTextField(20);
		
		btn_save = new JButton("SAVE");
		btn_close = new JButton("CLOSE");
		
		btn_save.addActionListener(this);
		btn_close.addActionListener(this);
		
		frame.setLayout(new FlowLayout());
		frame.add(lbl_1);
		frame.add(txt_1);
		frame.add(lbl_2);
		frame.add(txt_2);
		frame.add(lbl_3);
		frame.add(txt_3);
		frame.add(lbl_4);
		frame.add(txt_4);
		frame.add(lbl_5);
		frame.add(txt_5);
		frame.add(btn_save);
		frame.add(btn_close);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JDBC_GUI_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_save) {
			//Getting Values
			int sn;
			String name, address, email, phone;
			sn = Integer.parseInt(txt_1.getText());
			name = txt_2.getText();
			address = txt_3.getText();
			email = txt_4.getText();
			phone = txt_5.getText();
			
			// Values to Object
			Contact contact = new Contact(sn, name, address, email, phone);
			MyDatabase mdb = new MyDatabase();
			boolean result = mdb.insert(contact);
			JDialog d;
			if (result == true) {
				JOptionPane.showMessageDialog(frame, "Save Record Successfully");
			}
			else {
				JOptionPane.showMessageDialog(frame, "Error to save record");
			}			
		}
		else if (e.getSource()==btn_close){
			System.out.println("Close");
			System.exit(0);
		}		
	}
}