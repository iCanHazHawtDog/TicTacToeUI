
package edu.luc.tictactoe.gui.controller;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


/**
 * @author matt
 *
 */

@SuppressWarnings("serial")
public class BoardSameComputer extends JPanel{
	
	static JFrame frame = new JFrame();
	JTextField text = new JTextField(18);
	
	public BoardSameComputer() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1200, 800));
	}
	
	
	public void addComponentsToPane(Container pane) {
		JPanel gui = new JPanel(new BorderLayout());
        gui.setBorder(new BevelBorder(BevelBorder.RAISED));
        gui.setLayout(new GridLayout(1,2, 5, 5));
		JPanel labels = new JPanel();
		labels.setLayout(new GridLayout(10,1));
//		pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
		JLabel x = new JLabel("Player Name");
		JLabel o = new JLabel("Player Name");
		labels.add(new JLabel(""));
		labels.add(x);
		labels.add(o);
//		playerName.setAlignmentX(Component.CENTER_ALIGNMENT);
		for (int i = 1; i < 3; i++ ){
    		labels.add(new JLabel(""));
    	}
		JLabel turn = new JLabel("Matt's turn");
		labels.add(turn);
		labels.add(new JButton(new AbstractAction("Reset") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		labels.add(new JButton(new AbstractAction("Main Menu") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		labels.add(new JLabel(""));
		gui.add(labels);
		
		JPanel tiles = new JPanel();
		tiles.setLayout(new GridLayout(3,3));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		tiles.add(new JButton(new AbstractAction("") {
    		
            @Override
            public void actionPerformed(ActionEvent e) {
          	  
            }
      	}));
		gui.add(tiles);
		pane.add(gui);
    }
    
}
