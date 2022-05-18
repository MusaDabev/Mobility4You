package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import catalogues.Catalogue;
import models.ElCar;
import models.GasCar;
import models.HybridCar;

public class MyFrame extends JFrame{
	private Catalogue catalogue = new Catalogue();
	
	private JPanel upPanel = new JPanel();
	private JPanel midPanel = new JPanel();
	private JPanel downPanel = new JPanel();
	
	private JLabel brandLabel = new JLabel("Brand");
	private JLabel modelLabel = new JLabel("Model");
	private JLabel engineLabel = new JLabel("Engine Displament");
	private JLabel powerLabel = new JLabel("Power of eng.");
	private JLabel capacityLabel = new JLabel("Capacity");
	private JLabel priceLabel = new JLabel("Price");
	
	private JTextField brandTField = new JTextField();
	private JTextField modelTField = new JTextField();
	private JTextField engineTField = new JTextField();
	private JTextField powerTField = new JTextField();
	private JTextField capacityTField = new JTextField();
	private JTextField priceTField = new JTextField();
	private JTextField fileTField = new JTextField(40);
	
	private JButton loadBtn = new JButton("Load");
	private JButton printBtn = new JButton("Print");
	private JButton addCarBtn = new JButton("Add Car");
	
	private String[] options = {"Electric", "Gas", "Hybrid"};
	private JComboBox<String> addCombo= new JComboBox<>(options);
	
	public MyFrame() {
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 600);
		
		this.setLayout(new GridLayout(3, 1));
		this.add(upPanel);
		this.add(midPanel); // FlowLayout
		this.add(downPanel);
		
		setupUpPanel();
		setupMidPanel();
	}//end constructor
	
	private void setupUpPanel() {
		upPanel.setLayout(new GridLayout(6,2));
		upPanel.add(brandLabel);
		upPanel.add(brandTField);
		upPanel.add(modelLabel);
		upPanel.add(modelTField);
		upPanel.add(engineLabel);
		upPanel.add(engineTField);
		upPanel.add(powerLabel);
		upPanel.add(powerTField);
		upPanel.add(capacityLabel);
		upPanel.add(capacityTField);
		upPanel.add(priceLabel);
		upPanel.add(priceTField);
	}//end setupUpPanel
	
	private void setupMidPanel() {
		midPanel.add(fileTField);
		midPanel.add(loadBtn);
		midPanel.add(printBtn);
		midPanel.add(addCombo);
		midPanel.add(addCarBtn);
		
		loadBtn.addActionListener(new LoadAction());
		printBtn.addActionListener(new PrintAction());
		addCarBtn.addActionListener(new AddCarAction());
	}//end setupMidPanel
	
	class AddCarAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String brand = brandTField.getText();
			String model = modelTField.getText();
			float engine = Float.parseFloat(engineTField.getText());
			int power = Integer.parseInt(powerTField.getText());
			int capacity = Integer.parseInt(capacityTField.getText());
			int price = Integer.parseInt(priceTField.getText());
			
			switch (addCombo.getSelectedIndex()) {
			case 0:	catalogue.addCar(new ElCar(brand, model, power, capacity, price));
				break;
			case 1:	catalogue.addCar(new GasCar(brand, model, engine, power, price));
				break;	
			case 2:	catalogue.addCar(new HybridCar(brand, model, engine, power, capacity, price));
				break;
			}//end switch
			clearFields();
		}
		
	}//end AddCarAction
	
	private void clearFields() {
		brandTField.setText("");
		modelTField.setText("");
		engineTField.setText("");
		powerTField.setText("");
		capacityTField.setText("");
		priceTField.setText("");
	}//end clearFields
	
	class PrintAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			catalogue.printCatalogue();		
		}
		
	}//end PrintAction
	
	class LoadAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String path = fileTField.getText();
			catalogue.loadFromFile(path);
		}
		
	}//end LoadAction

}//end MyFrame
