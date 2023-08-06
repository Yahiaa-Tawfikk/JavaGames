package Graphics;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton Button = new JButton("window");
	
	
	LaunchPage(){
		
	    Button.setBounds(100, 160, 200, 400);
	    Button.setFocusable(false);
	    Button.addActionListener(this);
		
		frame.add(Button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Button){
			
		}
		
	}

}
