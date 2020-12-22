package swing.top_level_containers;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogTest1 implements ActionListener {
	JFrame frame;
	JButton btn_show;	
	public JDialogTest1() {
		frame=new JFrame();
		frame.setTitle("JDialog Test");
		frame.setSize(new Dimension(250, 250));

		btn_show = new JButton("Show");
		btn_show.addActionListener(this);
		
		frame.setLayout(new FlowLayout());		
		frame.add(btn_show); 
		frame.setVisible(true);				
	}

	public static void main(String[] args) {
		new JDialogTest1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_show) {
			//JDialog dialog = new JDialog(frame, "Test Dialog");
			JDialog dialog = new JDialog(frame, "Test Dialog", true);
			dialog.setSize(150, 150);
			dialog .setVisible(true);	
		}		
	}
}

