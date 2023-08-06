package Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {

		private JButton ok;
		private JButton cancel;
		private JLabel label1;
		private JTextField name;
		private JComboBox<String> combo;
		public Main() {

			label1 = new JLabel("Player Name");
			label1.setBounds(30, 100, 100,100);
			this.getContentPane().add(label1);

			name = new JTextField();
			name.setBounds(200, 100, 100, 100);
			this.getContentPane().add(name);

			ok = new JButton("okay");
			ok.setBounds(30, 300, 100, 100);
			ok.addActionListener(this);
			this.getContentPane().add(ok);

			cancel = new JButton("Start Game");
			cancel.setBounds(250, 200, 100, 90);
			cancel.addActionListener(this);
			cancel.setIcon(new ImageIcon(""));
			this.getContentPane().add(cancel);

			String[] x = { "Select City", "Cairo", "Sparta", "Rome" };
			combo = new JComboBox<String>(x);
			combo.setBounds(75, 300, 150, 25);
			combo.addActionListener(this);
			this.getContentPane().add(combo);

			this.getContentPane().setLayout(null);
			this.setTitle("Game of Empires");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(450, 450);
			this.setVisible(true);
			
			
			
		}

		
		public void actionPerformed(ActionEvent y) {
			if (y.getSource() == ok) {
				if (name.getText().equals("")) {
					JOptionPane.showMessageDialog(this, "You must input a name", 
							"Error", JOptionPane.ERROR_MESSAGE);

				}
			} else if (y.getSource() == cancel) {

			} else if (y.getSource() == combo) {

			}

		}

		public static void main(String[] args) {
			Main g = new Main();
		}

	}//



