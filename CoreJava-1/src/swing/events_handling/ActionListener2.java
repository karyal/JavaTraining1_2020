package swing.events_handling;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListener2 extends JFrame {
	
	JButton btn1;
	JButton btn2;
	
	public ActionListener2() {
		setTitle("Action Listener Test1");
		setSize(new Dimension(250, 250));
		setLayout(new FlowLayout());
		
		btn1=new JButton("Close-1");
		btn2=new JButton("Close-2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Hello from Close Button-1");
				//System.exit(0);
	        }
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Hello from Close Button-2");
				//System.exit(0);
	        }
		});
		
		add(btn1);
		add(btn2);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionListener2();		
	}
}