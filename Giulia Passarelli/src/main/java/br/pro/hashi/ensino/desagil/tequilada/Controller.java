package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements ActionListener, KeyListener {
	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.update();
		view.repaint();
	}
	@Override
	public void keyPressed(KeyEvent event) {
		if(event.getKeyCode() == KeyEvent.VK_UP){
			model.getHumanPlayer().move(-1, 0);
		}
		if(event.getKeyCode() == KeyEvent.VK_DOWN){
			model.getHumanPlayer().move(1, 0);
		}
		if(event.getKeyCode() == KeyEvent.VK_RIGHT){
			model.getHumanPlayer().move(0, 1);
		}
		if(event.getKeyCode() == KeyEvent.VK_LEFT){
			model.getHumanPlayer().move(0, -1);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}