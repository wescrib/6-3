import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;


public class GridLayoutDemo extends JFrame {

	private GridLayoutDemo() {
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		JTextField text3 = new JTextField(10);
		JTextField text4 = new JTextField(10);
		JTextField text5 = new JTextField(10);
		setLayout(new GridLayout(2,2));
		
		add(text1);
		add(text2);
		add(text3);
		add(text4);
		add(text5);
		setSize(500,275);
		setTitle("REDRUM");
		add(panel);
		setVisible(true);
		setSize(new Dimension(500,500));
		
		
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}
