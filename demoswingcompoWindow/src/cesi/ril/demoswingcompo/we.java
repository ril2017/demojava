package cesi.ril.demoswingcompo;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class we implements WindowListener {

	private JFrame MyFrame1 = new JFrame();
	
	public we() {
		MyFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cont = MyFrame1.getContentPane();
		MyFrame1.setTitle("Mon projet Swing avec évènements");;
		MyFrame1.setPreferredSize(new Dimension(400, 300));
		cont.setLayout(new FlowLayout());
		
		MyFrame1.addWindowListener(this);
		
		MyFrame1.pack();		
		MyFrame1.setVisible(true);	// lancer l'application
	}
	
	public static void main(String[] args) {
		
		we windowEvent = new we();
		
		
	}
	
	// https://docs.oracle.com/javase/7/docs/api/java/awt/event/WindowListener.html
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Window Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Window closing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Window closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Window Iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Window Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Window Activited");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Window Deactivited");
	}

}
