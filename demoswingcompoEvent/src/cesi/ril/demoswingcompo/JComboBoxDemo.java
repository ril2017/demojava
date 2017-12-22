package cesi.ril.demoswingcompo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxDemo {

	private JFrame MyFrame1 = new JFrame();
	private String[] options = {"apples", "oranges", "bananas", "grapes"};
	private JComboBox<String> combobox = new JComboBox<String>(options);
	private ImageIcon apples = new ImageIcon("apples.jpg");
	private ImageIcon bananas = new ImageIcon("bananas.jpg");
	private ImageIcon grapes = new ImageIcon("grapes.jpg");
	private ImageIcon oranges = new ImageIcon("oranges.jpg");
	private JLabel lblImage = new JLabel();
	
	private ItemHandler handler = new ItemHandler();
	
	public JComboBoxDemo() {
		MyFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame1.setTitle("Mon projet Swing avec évènements");;
		MyFrame1.setPreferredSize(new Dimension(400, 300));
		MyFrame1.setLayout(new FlowLayout());

		MyFrame1.add(combobox);
		combobox.addItemListener(handler);
		
		MyFrame1.add(lblImage);

		MyFrame1.pack();		
		MyFrame1.setVisible(true);	// lancer l'application
	}
	
	public static void main(String[] args) {
		
		JComboBoxDemo comboboxdemo = new JComboBoxDemo();
		
		
	}
	
	private class ItemHandler implements ItemListener {
		
		public void itemStateChange(ItemEvent event) {

		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == combobox) {
				if (combobox.getSelectedItem().equals("apples")) {
					lblImage.setIcon(apples);
				} else if (combobox.getSelectedItem().equals("oranges")) {
					lblImage.setIcon(oranges);
				} else if (combobox.getSelectedItem().equals("bananas")) {
					lblImage.setIcon(bananas);
				} else if (combobox.getSelectedItem().equals("grapes")) {
					lblImage.setIcon(grapes);
				}
			}
			
		}
	}

}
