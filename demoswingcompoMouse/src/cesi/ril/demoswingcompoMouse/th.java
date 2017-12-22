package cesi.ril.demoswingcompoMouse;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class th implements MouseMotionListener {

	public void mouseMoved(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		System.out.println("Mouse Move Event:(" + x + "," + y +")");
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		System.out.println("Mouse Drag Event:(" + x + "," + y +")");
		
	}

	public static void main(String args[]) {
	
		JFrame jf = new JFrame("Event");
		jf.setSize(new Dimension(400, 300));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addMouseMotionListener(new th());
		jf.setVisible(true);;
		
	}
}