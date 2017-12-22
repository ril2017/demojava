package cesi.ril.demoswingcompo;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Layouts
import java.awt.BorderLayout; // exo 2 : 10
import java.awt.CardLayout; // exo 2 : 13
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre2 {

	public static void main(String[] args) {
		
		final JButton bouton = new JButton("Clic moi");  // exo 2 : 1
		final JButton bouton1 = new JButton("Bouton 1");  // exo 2 : 12
		final JButton bouton2 = new JButton("Bouton 2");  // exo 2 : 12
		final JPanel conteneur = new JPanel();  // exo 2 : 2
		final JTextField texte = new JTextField("Zone de texte"); // exo 2 : 4
		final JComboBox<String> combo = new JComboBox<String>();  // exo 2 : 6
		final JLabel label = new JLabel("Je suis un label"); // exo 2 : 8
		
		// TODO Instancier une JFrame
		JFrame MyFrame1 = new JFrame();
	
		// exo 2 : 13
		CardLayout cardL = new CardLayout(); // exo 2 : 13
		JPanel content = new JPanel(); // exo : 13
		
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
		
		// exo 2 : 13
		JPanel pan1 = new JPanel();
		pan1.add(new JTextField("Je suis du panneau pan1")); // exo 2 : 13
		pan1.setBackground(Color.DARK_GRAY);
		JPanel pan2 = new JPanel();
		pan2.add(new JTextField("Je suis du panneau pan2")); // exo 2 : 13
		pan1.setBackground(Color.GREEN);
		JPanel boutonPane = new JPanel();
		bouton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardL.next(content);;
			}
		});
		boutonPane.add(bouton);
		content.setLayout(cardL);
		content.add(pan1);
		content.add(pan2);
		MyFrame1.getContentPane().add(boutonPane, BorderLayout.NORTH);
		MyFrame1.getContentPane().add(content, BorderLayout.CENTER);		
		
		
		
		
		// TODO Ajout du bouton dans le conteneur
	/*	conteneur.add(bouton); // exo 2 : 3
		conteneur.add(texte); // exo 2: 5 // tester l'application
		MyFrame1.setContentPane(conteneur); // exo 2 : 3 // tester l'application
		
		// exo 2 : 7
		// Ajout déléments dans la combobox
		combo.addItem("Débutant JavaSE");
		combo.addItem("Débutant JavaEE");
		combo.addItem("Débutant Java Android");
		conteneur.add(combo);
		
		// exo 2 : 9
		// Ajouter le label
		conteneur.add(label); */
		
/*		// exo 2 : 11
		// Mettre exo 2 : 7 en commentaire
		conteneur.setLayout(new BorderLayout());
		conteneur.add(bouton,  BorderLayout.WEST);
		conteneur.add(bouton, BorderLayout.EAST);
		conteneur.add(texte, BorderLayout.NORTH);
		combo.addItem("Je suis le combo au sud");
		conteneur.add(combo, BorderLayout.SOUTH);
		conteneur.add(label, BorderLayout.CENTER);
		MyFrame1.setContentPane(conteneur);
		MyFrame1.pack();
*/		
		
	 /*   // exo 2 : 12
		MyFrame1.setContentPane(conteneur);
		conteneur.add(bouton1);
		conteneur.add(bouton2);
		conteneur.setLayout(new BoxLayout(conteneur, BoxLayout.LINE_AXIS)); // en ligne
		//conteneur.setLayout(new BoxLayout(conteneur, BoxLayout.PAGE_AXIS)); // en colonne
	*/	 
		
		// exo 2 : 13
		
		// TODO Afficher la JFrame
		MyFrame1.setVisible(true);	// lancer l'application
		
	}

}
