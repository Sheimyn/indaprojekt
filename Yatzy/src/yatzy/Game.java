package yatzy;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Game {
	
	static Color gameColor = new Color(85, 140, 47);

	public static void main(String args[]) {
	      createGameGUI();

 
	}


	private static void createGameGUI(){
		int players = Integer.parseInt(JOptionPane.showInputDialog("Derp"))+1; //amount of player + 1 button row
		JFrame gameField = new JFrame("Yatzy");
		gameField.setResizable(false);
		//JPanel gameBorder = new JPanel();
		GamePanel gameBackground = new GamePanel();
        Scoresheet gameBorder2 = new Scoresheet(players, gameBackground);
        
		gameField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameField.setSize(400+(40*players),600);

		//gameBorder.setBackground(Color.green);
		gameBorder2.setBackground(gameColor);
		gameBackground.setBackground(Color.white);
		gameBackground.
		setBorder(BorderFactory.createLineBorder(gameColor, 7));

		//gameField.add(gameBorder, BorderLayout.WEST);
		gameField.add(gameBorder2, BorderLayout.CENTER);
		gameField.add(gameBackground, BorderLayout.WEST);
         

		gameField.setVisible(true);
		gameBackground.repaint();

	}
}
