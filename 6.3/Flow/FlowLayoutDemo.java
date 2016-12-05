import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;


public class FlowLayoutDemo extends JFrame {

	private FlowLayoutDemo() {
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JTextField text3 = new JTextField(20);
		JTextField text4 = new JTextField(20);
		JTextField text5 = new JTextField(20);
		
		
		setLayout(new FlowLayout());
		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(text5);
		setSize(new Dimension(500,500));
		setTitle("REDRUM");
		add(panel);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}

}
