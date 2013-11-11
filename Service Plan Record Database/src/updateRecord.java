import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import javax.swing.JLabel;
//import javax.swing.JTextArea;
import javax.swing.JTextField;

public class updateRecord extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JFrame window;  
	private JPanel pane; 
	private JButton btn_update; 
	private JLabel LBLtitle, LBLfirstName, LBLsurName, LBLcustomerAddress1, LBLcustomerAddress2, LBLpostCode, LBLcarRegistration, LBLcarModel, LBLdateSoldField, LBLinvoiceNumber, LBLsoldBy, LBLsalesBranch, LBLtype, LBLpaymentMethod, LBLVATrate, LBLtotalPrice, LBLVAT, LBLinvoiceTotal, LBLnumberOfServices;  
	private JTextField title, firstName, surName, customerAddress1, customerAddress2, postCode, carRegistration, carModel, dateSoldField, invoiceNumber, soldBy, salesBranch, type, paymentMethod, VATrate, totalPrice, VAT, invoiceTotal, numberOfServices;
	
  public updateRecord()
  { 
	  window = new JFrame("Update a record"); 
	  pane = new JPanel();  
	  btn_update = new JButton("Edit"); 
	  LBLtitle = new JLabel("Title:"); 
	  LBLfirstName = new JLabel("Firstname:"); 
	  LBLsurName = new JLabel("Surname: "); 
	  LBLcustomerAddress1 = new JLabel("Customer Address Line 1: "); 
	  LBLcustomerAddress2 = new JLabel("Customer Address Line 2: ");   
	  LBLpostCode = new JLabel("Postcode: ");  
	  LBLcarRegistration = new JLabel("Car registration: "); 
	  LBLcarModel = new JLabel("Car Model: "); 
	  LBLdateSoldField = new JLabel("Date Sold: "); 
	  LBLinvoiceNumber = new JLabel("Invoice Number: "); 
	  LBLsoldBy = new JLabel("Sold By: "); 
	  LBLsalesBranch = new JLabel("Sales Branch: "); 
	  LBLtype = new JLabel("Type: "); 
	  LBLpaymentMethod = new JLabel("Payment Method: "); 
	  LBLVATrate = new JLabel("VAT Rate: "); 
	  LBLtotalPrice = new JLabel("Total Price: "); 
	  LBLVAT = new JLabel("VAT: ");
	  LBLinvoiceTotal = new JLabel("Invoice Total: "); 
	  LBLnumberOfServices = new JLabel("Number of Services: ");
	  
	  title = new JTextField(3);  
	  firstName = new JTextField(25); 
	  surName = new JTextField(25); 
	  customerAddress1 = new JTextField(50); 
	  customerAddress2 = new JTextField(50);   
	  postCode = new JTextField(10);  
	  carRegistration = new JTextField(10); 
	  carModel = new JTextField(50); 
	  dateSoldField = new JTextField(); 
	  invoiceNumber = new JTextField(10); 
	  soldBy = new JTextField(50); 
	  salesBranch = new JTextField(50); 
	  type = new JTextField(50); 
	  paymentMethod = new JTextField(50); 
	  VATrate = new JTextField(3); 
	  totalPrice = new JTextField(10); 
	  VAT = new JTextField(10);
	  invoiceTotal = new JTextField(10); 
	  numberOfServices = new JTextField(5);
	  
	  
	  
	  GridBagConstraints gc = new GridBagConstraints(); 
	  
	  window.setSize(600, 800);
	  
	  gc.gridx = 0; 
	  gc.gridy = 0;
	  pane.add(LBLtitle, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 1;
	  pane.add(LBLfirstName, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 2;
	  pane.add(LBLsurName, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 3;
	  pane.add(LBLcustomerAddress1, gc);  
	  gc.gridx = 0; 
	  gc.gridy = 4;
	  pane.add(LBLcustomerAddress2, gc);  
	  gc.gridx = 0; 
	  gc.gridy = 5;
	  pane.add(LBLpostCode, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 6;
	  pane.add(LBLcarRegistration, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 7;
	  pane.add(LBLcarModel, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 8;
	  pane.add(LBLdateSoldField, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 9;
	  pane.add(LBLinvoiceNumber, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 10;
	  pane.add(LBLsoldBy, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 11;
	  pane.add(LBLsalesBranch, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 12;
	  pane.add(LBLtype, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 13;
	  pane.add(LBLpaymentMethod, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 14;
	  pane.add(LBLVATrate, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 15;
	  pane.add(LBLtotalPrice, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 16;
	  pane.add(LBLinvoiceTotal, gc); 
	  gc.gridx = 0; 
	  gc.gridy = 17;
	  pane.add(LBLnumberOfServices, gc); 
	  
	  
	  
	  
	  gc.gridx = 1; 
	  gc.gridy = 0; 
	  pane.add(title, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 1; 
	  pane.add(firstName, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 2; 
	  pane.add(surName, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 3; 
	  pane.add(customerAddress1, gc);
	  gc.gridx = 1; 
	  gc.gridy = 4;
	  pane.add(customerAddress2, gc);  
	  gc.gridx = 1; 
	  gc.gridy = 5;
	  pane.add(postCode, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 6;
	  pane.add(carRegistration, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 7;
	  pane.add(carModel, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 8;
	  pane.add(dateSoldField, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 9;
	  pane.add(invoiceNumber, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 11;
	  pane.add(soldBy, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 11;
	  pane.add(salesBranch, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 12;
	  pane.add(type, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 13;
	  pane.add(paymentMethod, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 14;
	  pane.add(VATrate, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 15;
	  pane.add(totalPrice, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 16;
	  pane.add(invoiceTotal, gc); 
	  gc.gridx = 1; 
	  gc.gridy = 17;
	  pane.add(numberOfServices, gc); 
	  
	  gc.gridx = 1; 
	  gc.gridy = 19; 
	  pane.add(btn_update, gc);
	  
	  btn_add.addActionListener(this);
	  
	  window.add(pane);
	  
	  window.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  window.setVisible(true);   
  }
	
public void DBConnect()
{  
    try
    {
    String host = "jdbc:mysql://localhost:3306/data";
    String username = "root";
    String password = "";
    //Class.forName("src.mysql.jdbc.Driver");
   
    Connection con = DriverManager.getConnection(host, username, password);
    Statement stmt = con.createStatement(); 
    
    String get_Var_title =  title.getText();	
	String get_Var_firstName = firstName.getText();  
	String get_Var_surName = surName.getText();
	String get_Var_customerAddress1 = customerAddress1.getText();
	String get_Var_customerAddress2 = customerAddress2.getText();  
    String get_Var_postCode = postCode.getText();
	String get_Var_carRegistration = carRegistration.getText();
	String get_Var_carModel = carModel.getText();
	String get_Var_dateSoldField = dateSoldField.getText();
	String get_Var_invoiceNumber = invoiceNumber.getText();
	String get_Var_soldBy = soldBy.getText();
	String get_Var_salesBranch = salesBranch.getText(); 
	String get_Var_type = type.getText();
	String get_Var_paymentMethod = paymentMethod.getText();  
	String get_Var_VATrate = VATrate.getText();
	String get_Var_totalPrice = totalPrice.getText();
	String get_Var_VAT = VAT.getText();
	String get_Var_invoiceTotal = invoiceTotal.getText(); 
	String get_Var_numberOfServices = numberOfServices.getText();
    
    String SQL = "INSTERT INTO records (title, firstName, surName, customerAddress1, customerAddress2, postCode, carRegistration, carModel, dateSoldField, invoiceNumber, soldBy, salesBranch, type, paymentMethod, VATrate, totalPrice, VAT, invoiceTotal, numberOfServices) VALUES ("'"+get_Var_title+"'", "'"+get_Var_firstName+"'", "'"+get_Var_surName+"'", "'"+get_Var_customerAddress1+"'", "'"+get_Var_customerAddress2+"'", "'"+get_Var_postCode+"'", "'"+get_Var_carRegistration+"'", "'"+get_Var_carModel+"'", "'"+get_Var_dateSoldField+"'", "'"+get_Var_invoiceNumber+"'", "'"+get_Var_soldBy+"'", "'"+get_Var_salesBranch+"'", "'"+get_Var_type+"'", "'"+get_Var_paymentMethod+"'", "'"+get_Var_VATrate+"'", "'"+get_Var_totalPrice+"'", "'"+get_Var_VAT+"'", "'"+get_Var_invoiceTotal+"'", "'"+get_Var_numberOfServices+"'")"";
    ResultSet rs = stmt.executeQuery(SQL); 
   rs.updateRow();
    {
    	     rs.updateString("title" get_Var_title);	
    		 rs.updateString("firstName" get_Var_firstName);  
    		 rs.updateString("surName" get_Var_surName);
    		 rs.updateString("customerAddress1" get_Var_customerAddress1);
    		 rs.updateString("customerAddress2" get_Var_customerAddress2);  
    	     rs.updateString("postCode" get_Var_postCode);
    		 rs.updateString("carRegistration" get_Var_carRegistration);
    		 rs.updateString("carModel" get_Var_carModel);
    		 rs.updateString("dateSoldField" get_Var_dateSoldField);
    		 rs.updateString("invoiceNumber" get_Var_invoiceNumber);
    		 rs.updateString("soldBy" get_Var_soldBy);
    		 rs.updateString("salesBranch" get_Var_salesBranch); 
    		 rs.updateString("type" get_Var_type);
    		 rs.updateString("paymentMethod" get_Var_paymentMethod);  
    		 rs.updateString("VATrate" get_Var_VATrate);
    		 rs.updateString("totalPrice" get_Var_totalPrice);
    		 rs.updateString("VAT" get_Var_VAT);
    		 rs.updateString("invoiceTotal" get_Var_invoiceTotal); 
    		 rs.updateString("numberOfServices" get_Var_numberOfServices);	
    }
   JOptionPane.showMessageDialog(null, "Record Updated!");
    }
   
    catch (SQLException err)
    {
    	JOptionPane.showMessageDialog(DBConnect, err.getMessage());
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == btn_add)  	
	{ 
		DBConnect();
	}
}
}
