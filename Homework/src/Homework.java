import java.awt.*;
import javax.swing.*;
//hello world
public class Homework extends JFrame {

	private JButton [] menuBtn = new JButton [3];
	
	public Homework() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(3,1,20,20);
		c.setLayout(grid);
		
		menuBtn[0] = new JButton("楷遏贸");
		menuBtn[0].setSize(200,40);
		c.add(menuBtn[0]);
		
		menuBtn[1] = new JButton("距加 包府");
		menuBtn[1].setSize(200,40);
		c.add(menuBtn[1]);
		
		menuBtn[2] = new JButton("To-Do");
		menuBtn[2].setSize(200,40);
		c.add(menuBtn[2]);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Homework();
	}

}

