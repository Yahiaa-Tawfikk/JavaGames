package Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WelcomeView extends JLabel implements ActionListener {

	private JButton ok;
	private JLabel label1;
	private JTextField name;
	private JComboBox<String> combo;
	private MainView parentView;

	public WelcomeView(MainView parentView) {
		this.parentView = parentView;

		label1 = new JLabel("Player Name");
		label1.setBounds(40, 100, 100, 50);
		this.add(label1);

		name = new JTextField();
		name.setBounds(100, 100, 150, 50);
		this.add(name);

		String[] x = { "Select City", "Cairo", "Sparta", "Rome" };
		combo = new JComboBox<String>(x);
		combo.setBounds(150, 150, 200, 50);
		combo.addActionListener(this);
		this.add(combo);

		ok = new JButton("Start Game");
		ok.setBounds(100, 300, 100, 50);
		ok.addActionListener(this);
		this.add(ok);

		this.setVisible(true);
		this.setSize(1000, 1000);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			if (name.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "You must input a name", "Error", JOptionPane.ERROR_MESSAGE);

			} else if (combo.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(this, "You must choose a city", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				parentView.test(name.getText(), (String)combo.getSelectedItem());
			}
		}

	}
}
