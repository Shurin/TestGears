package com.shurin.testgears;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

	@Override
	public void keyPressed(KeyEvent key) {
		if (key.getKeyCode() == KeyEvent.VK_ESCAPE) System.exit(0);
		System.out.println("Key: " + key.getKeyCode());		
	}

	@Override
	public void keyReleased(KeyEvent key) {
		if (key.getKeyCode() == KeyEvent.VK_ESCAPE) System.exit(0);
		System.out.println("Key: " + key.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent key) {
		if (key.getKeyCode() == KeyEvent.VK_ESCAPE) System.exit(0);
		System.out.println("Key: " + key.getKeyCode());
	}

}
