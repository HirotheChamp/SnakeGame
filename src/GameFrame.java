import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	//constructor
 GameFrame(){
	 
		/*
		 * GamePanel panel = new GamePanel();
		 * 
		 * this.add(panel);
		 */

	 //^^these two have the same functionality
	 this.add(new GamePanel());
	 this.setTitle("Snake");
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setResizable(false);
	 
	 //take JFrame and add it to other components in the frame
	 this.pack();
	 this.setVisible(true);
	 this.setLocationRelativeTo(null);
	 
 }
 
}
