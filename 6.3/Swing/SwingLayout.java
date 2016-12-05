import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;


public class SwingLayout extends JFrame {

	private SwingLayout() {
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(50);
		JTextField text2 = new JTextField(50);
		JTextField text3 = new JTextField(25);
		JTextField text4 = new JTextField(25);
		JTextField text5 = new JTextField(10);
		
		text3.setSize(10,10);
		
		panel.setLayout(new BorderLayout());
		panel.add(text1,BorderLayout.NORTH);
		panel.add(text2,BorderLayout.SOUTH);
		panel.add(text3, BorderLayout.WEST);
		panel.add(text4, BorderLayout.EAST);
		panel.add(text5, BorderLayout.CENTER);
		setSize(1000,500);
		setTitle("REDRUM");
		add(panel);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new SwingLayout();
	}

}
