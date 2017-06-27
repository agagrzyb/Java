
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsd09
 */
public interface AddressBookDataDAO {

    public ArrayList<AddressBookData> getAllEntries();

    public ArrayList<AddressBookData> searchByLastName(String lastname);

    public boolean insert(String firstname, String lastname, String email, String phoneNumber);

    public boolean update(int id, String firstname, String lastname, String email, String phoneNumber);

    public boolean delete(int id);
}
