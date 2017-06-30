
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

        try (Connection conn = DriverManager.getConnection(url)) {

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

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to connect");

        }

        return ListOfData;

    }

    @Override
    public ArrayList<AddressBookData> searchByLastName(String lastnameSearch) {
         /* Create an ArrayList to hold the entries from the database */
        ArrayList<AddressBookData> listOfData = new ArrayList<>();
        /* URL for connecting to the database */
        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";
        /* Creating the Connection */
        try (Connection conn = DriverManager.getConnection(url)) {
            /* SQL to get records from the database */
            String sql = "SELECT * FROM AddressBookEntries WHERE lastname = ?";
            /* PreparedStatement is used to execute SQL against the DB */
            PreparedStatement stmt = conn.prepareStatement(sql);
            /* Specify what the question mark will be */
            stmt.setString(1, lastnameSearch);
            
            /* A select stmt gives back a ResultSet = table of data */
            ResultSet rs = stmt.executeQuery();
            /* Looping through the ResultSet */
            while (rs.next()) {
                /* Getting the value from each field */
                int id = rs.getInt(1);
                String firstname = rs.getString(2);
                String lastname = rs.getString(3);
                String email = rs.getString(4);
                String phoneNumber = rs.getString(5);
                
                /* Using the data from one row in the resultset to
                create an AddressBookData object */
                AddressBookData data = new AddressBookData(id,
                        firstname, lastname, email, phoneNumber);
                /* Add that data object to the arraylist  */
                listOfData.add(data);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                    "Error connecting/ retrieving data");
        }
        /* Return the ArrayList */
        return listOfData;
    }

    @Override
    public boolean insert(String firstname, String lastname,
            String email, String phoneNumber) {

        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";

        try (Connection conn = DriverManager.getConnection(url)) {

            String sql = "INSERT INTO AddressBookEntries VALUES (?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setString(3, email);
            stmt.setString(4, phoneNumber);

            int rowCount = stmt.executeUpdate();
            /* If the rowCount is 1, then a row was inserted and
             true will be return, if rowCount is not 1, a row was
             not inserted and false will be returned. */
            return rowCount == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(int id, String firstname, String lastname, String email, String phoneNumber) {
       
        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";
        
        try (Connection conn = DriverManager.getConnection(url)) {
            
            String sql = "UPDATE AddressBookEntries "
                    + "SET firstname = ?, lastname = ?, "
                    + "email = ?, phoneNumber = ? "
                    + "WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setString(3, email);
            stmt.setString(4, phoneNumber);
            stmt.setInt(5, id);
            
            int rowCount = stmt.executeUpdate();
            /* rowCount will be 1 if the delete was successful */
            return rowCount == 1;
        } catch(SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {

        String url = "jdbc:sqlserver://localhost;"
                + "integratedSecurity=true;"
                + "databaseName=AddressBook";

        try (Connection conn = DriverManager.getConnection(url)) {

            String sql = "DELETE FROM AddressBookEntries WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowCount = stmt.executeUpdate();
            //rowCount will be 1 ig the delete was successful
            return rowCount == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
