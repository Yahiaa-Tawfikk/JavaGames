package Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainView extends JFrame {
	
	private WelcomeView welcomeView;
	
	
	public MainView() {
		welcomeView = new WelcomeView(this);
		welcomeView.setBounds(10, 10, 500, 400);
		this.getContentPane().add(welcomeView);
		
		this.getContentPane().setLayout(null);
		this.setTitle("Game of Empires");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 1000);
		this.setVisible(true);
	}
	
	public void test(String playerName,String cityName) {
		System.out.println(playerName + " " + cityName);
		welcomeView.setVisible(false);
		
	}
	
	public static void main(String[] args) {
		MainView m = new MainView();
	}
}
