package Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class WorldView extends JPanel implements ActionListener {
	public void World(){
		
		ImageIcon image = new ImageIcon("pi.PNG");
		JLabel  label = new JLabel();
		label.setIcon(image);
		
		JFrame Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(1000,1000);
		Frame.setVisible(true);
		Frame.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent g) {
		
		
		
	}
 	

}
