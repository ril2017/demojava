package cesi.ril.demoswing;

import javax.swing.JFrame;

public class DemoFenetre1 {

	public static void main(String[] args) {
		// TODO Instancier une JFrame
		JFrame MyFrame1 = new JFrame();
	
		// TODO modifier le titre de la fenètre
		MyFrame1.setTitle("Mon projet Swing");;
		
		// TODO taille non modifiable par l'utilisateur
		MyFrame1.setSize(400, 300);
		
		// TODO un clic sur croix entraine la fermeture de la fenètre
		MyFrame1.setResizable(false);
		
		// TODO afficher la JFrame
		MyFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// TODO Centrer la fenetre par rapport à l'écran de l'ordinateur
		MyFrame1.setLocationRelativeTo(null);
		
		// TODO Afficher la JFrame
		MyFrame1.setVisible(true);	// lancer l'application
		
	}

}
