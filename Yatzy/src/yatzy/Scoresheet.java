package yatzy;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Class Scoresheet - Constructs the score sheet, etc.
 * 
 * @author Kashmir Klingestedt & Edvard Mickos
 * @version 1.0
 */
public class Scoresheet extends JPanel {

	int players;
	private int columns;
	private static final int ROWS = 19;
	public String[] rules = new String[19];
    rules[0] = "Ones";
    rules[1] = "Twos";
    rules[2] = "Threes";
    rules[3] = "Fours";
    rules[4] = "Fives";
    rules[5] = "Sixes";
    rules[6] = "Sum";
    rules[7] = "Bonus";
	
	/**
	 * Constructor for Score sheet
	 */
	public Scoresheet(int players) {
		columns=players+1;
		setLayout(new GridLayout(ROWS, columns));
		for (int i=0; i<columns*ROWS; i++){
		JButton test = new JButton("blab");
		add(test);
		}
		this.players = players;
		
	}

	/**
	 * Draws the score sheet
	 * 
	 * @param columns Amount of columns
	 * @param rows Amount of rows
	 */
	public void drawSheet(int columns, int rows) {

	}

	/**
	 * Checks the values of the dices to figure out where it is allowed to put the score.
	 */
	public void clickScore() {

	}
}
