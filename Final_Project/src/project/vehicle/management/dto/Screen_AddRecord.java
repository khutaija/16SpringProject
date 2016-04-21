<<<<<<< HEAD
=======
package project.vehicle.management.dto;
/**
 * 
 * @author Dora
 *
 */
>>>>>>> origin/master
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
<<<<<<< HEAD

public class Screen_AddRecord extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JComboBox<String> conditionBox, yearBox;
    private JTextField vinField, makeField, modelField, trimField, typeField, priceField;
    private JButton add, cancel;
    private JLabel dealerName, vin, condition, year, make, model, trim, type, price;
    private Car car;
    private String dealerNameStr;
	
    
    public static void main(String args[]) {
        new Screen_AddRecord();
    }
	
	public Screen_AddRecord(){
		setTitle("Add car");
//		setLayout(g);
		createComponents();
		addComponent();
		addListeners();
		setFonts();
		makeItVisible();
		
	}

	private void setFonts() {
		// TODO Auto-generated method stub
		
	}

	private void createComponents() {
		
		dealerName = new JLabel("Dealer Name: " +"");//can't change name;
		vin =new JLabel("VIN:");
		condition = new JLabel("Car Condition: ");
		year = new JLabel("Year: ");
		make = new JLabel("Make: ");
		model = new JLabel("Model: ");
		trim = new JLabel("Trim: ");
		type = new JLabel("Body style: ");
		price = new JLabel("Price: ");
		
		add = new JButton("Add");
		cancel = new JButton("Cancel");
		
		vinField =new JTextField(20);
		makeField = new JTextField(20);
		modelField = new JTextField(20);
		trimField = new JTextField(20);
		typeField = new JTextField(20);
		priceField = new JTextField(20);
		
		String[] yearList = new String[47];
		for (int i = 1970, j = 0; i <= 2016; i++, j++) {
			yearList[j] = i + "";
		}
		yearBox = new JComboBox<String>(yearList);
		
		String[] Conditions = { "NEW", "USED", "CERTIFIED" };
		conditionBox = new JComboBox<String>(Conditions);

		
	}

	private void addListeners() {
	    AddListener a = new AddListener();
		add.addActionListener(a);
		

		CancelListener c = new CancelListener();
		cancel.addActionListener(c);
		
	}
	
	class AddListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class CancelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
		
	}

=======
public class Screen_AddRecord extends JFrame{
	
	//CarFileManager -> readCars, writeCars
private static final long serialVersionUID = 1L;
    private JComboBox<String> conditionBox, yearBox;
    private JTextField vinField, makeField, modelField, trimField, typeField, priceField;
    private JButton add, cancel;
    private JLabel dealerName, vin, condition, year, make, model, trim, type, price;
    private Car car;
    private String dealerNameStr;
	
    
    public static void main(String args[]) {
        new Screen_AddRecord();
    }
	
	public Screen_AddRecord(){
		setTitle("Add car");
//		setLayout(g);
		createComponents();
		addComponent();
		addListeners();
		setFonts();
		makeItVisible();
		
	}

	private void setFonts() {
		// TODO Auto-generated method stub
		
	}

	private void createComponents() {
		
		dealerName = new JLabel("Dealer Name: " +"");//can't change name;
		vin =new JLabel("VIN:");
		condition = new JLabel("Car Condition: ");
		year = new JLabel("Year: ");
		make = new JLabel("Make: ");
		model = new JLabel("Model: ");
		trim = new JLabel("Trim: ");
		type = new JLabel("Body style: ");
		price = new JLabel("Price: ");
		
		add = new JButton("Add");
		cancel = new JButton("Cancel");
		
		vinField =new JTextField(20);
		makeField = new JTextField(20);
		modelField = new JTextField(20);
		trimField = new JTextField(20);
		typeField = new JTextField(20);
		priceField = new JTextField(20);
		
		String[] yearList = new String[47];
		for (int i = 1970, j = 0; i <= 2016; i++, j++) {
			yearList[j] = i + "";
		}
		yearBox = new JComboBox<String>(yearList);
		
		String[] Conditions = { "NEW", "USED", "CERTIFIED" };
		conditionBox = new JComboBox<String>(Conditions);

		
	}

	private void addListeners() {
	    AddListener a = new AddListener();
		add.addActionListener(a);
		

		CancelListener c = new CancelListener();
		cancel.addActionListener(c);
		
	}
	
	class AddListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class CancelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
		
	}

>>>>>>> origin/master
	private void addComponent() {
		
		setLayout(new GridBagLayout());
//		GridBagConstraints gbc = new GridBagConstraints();
		add(dealerName, new GridBagConstraints(0, 0, 4, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(vin, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(vinField, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(condition, new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(conditionBox, new GridBagConstraints(4, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(year, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(yearBox, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(make, new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(makeField, new GridBagConstraints(4, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(model, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(modelField, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(trim, new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(trimField, new GridBagConstraints(4, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(type, new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(typeField, new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(price, new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(priceField, new GridBagConstraints(4, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(add, new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		add(cancel, new GridBagConstraints(3, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
	}

	private void makeItVisible() {
		this.setSize(500, 400);
		this.setVisible(true);
		setLocationRelativeTo(null); // show in the center
	}
	
	public void windowClosing(final WindowEvent e) {
		this.dispose();
	}
<<<<<<< HEAD
	
}
=======
}
>>>>>>> origin/master