
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


//CONTROLLER
//this class implements the AddressBookDataDAO 
//if you want access data for the address book you must implements the 
//following methods:
// - getAllEntries
// - searchByLastName
// - insert
// - update
// - delete

/*
 * DAO -  design pattern- data access object
 */

/**
 *
 * @author dsd09
 */
public class DatabaseManager implements AddressBookDataDAO {

    @Override
    public ArrayList<AddressBookData> getAllEntries() {
        
        ArrayList<AddressBookData> ListOfData = new ArrayList<>();
        
    
        String url = "jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=AddressBook";
        
        try(Connection conn = DriverManager.getConnection(url)){
            
            //System.out.println("Connected");
            String sql = "SELECT * From AddressBookEntries";
            //PreparedStatement interface object used to execute sql
            //conn create an instance and gives back a PreparedStatement object
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                //Get the data from each field in the row
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");

                //using the data from one row in the resultset
                AddressBookData data = new AddressBookData(id, firstname, lastname, email, phoneNumber);
                // add that object to arrayList
                ListOfData.add(data);

            }
        
        }catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to connect");
            
        }
        
        return ListOfData;
        
    }  
  

    @Override
    public ArrayList<AddressBookData> searchByLastName(String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(String firstname, String lastname, String email, String phoneNumber) {
        
        
         if (txtFirstName.getText().isEmpty()
                || txtLastName.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtPhoneNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You cannot have empty textfields");
        } else {
            //call the insert method in the manager class
            manager.insert(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), txtPhoneNumber.getText());
            //show a message box to say it worked
            JOptionPane.showMessageDialog(this, txtFirstName.getText() + " " + txtLastName.getText() + " was added");

            btnSelectAll.doClick();
            btnLast.doClick();
        }
    }

    @Override
    public boolean update(int id, String firstname, String lastname, String email, String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
