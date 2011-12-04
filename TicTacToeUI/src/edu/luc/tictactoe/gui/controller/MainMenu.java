
package edu.luc.tictactoe.gui.controller;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import edu.luc.tictactoe.gui.resources.ImagePanel;

/**
 * @author matt
 *
 */
@SuppressWarnings("serial")
public class MainMenu extends JPanel {

	static JFrame frame = new JFrame();
	
    public MainMenu() {
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setPreferredSize(new Dimension(500, 700));
    }
    
    public void addComponentsToPane(Container pane) {
    	ImagePanel panel = new ImagePanel("/home/matt/git/TicTacToeUI/TicTacToeUI/Images/UIMM.png");
    	pane.add(panel);
    	pane.setLayout(new GridLayout(10,1));
    	// Insert a space before the first button
    	for (int i = 1; i < 6; i++ ){
    		pane.add(new JLabel(""));
    	}
    	pane.add(new JButton(new AbstractAction("Play") {
    		
    		@Override
        	public void actionPerformed(ActionEvent e) {
    			frame.setVisible(false);
    			PlayGame matt = new PlayGame();
    			matt.addComponentsToPane(PlayGame.frame.getContentPane());
    			PlayGame.frame.pack();
    			PlayGame.frame.setVisible(true);
    		}
    	}));
    	pane.add(new JButton(new AbstractAction("HighScores") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.setVisible(false);
    			HighScores matt = new HighScores();
    			matt.addComponentsToPane(HighScores.frame.getContentPane());
    			HighScores.frame.pack();
    			HighScores.frame.setVisible(true);
            }
      	}));
    	pane.add(new JButton(new AbstractAction("Exit") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
      	}));
    	// Insert a space after the last button
    	pane.add(new JLabel(""));

    }
    
}