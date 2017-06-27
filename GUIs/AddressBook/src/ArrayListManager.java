
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsd09
 */
public class ArrayListManager implements AddressBookDataDAO {

    //global variable , arrayList holding all entries
    private ArrayList<AddressBookData> listOfData = new ArrayList<>();

    public void populateAddressBookList() {
        //populate an arraylist 
        AddressBookData data1 = new AddressBookData("John", "Jones", "john@gmail.com", "123-456-789");
        AddressBookData data2 = new AddressBookData("Mary", "Lennon", "mary@gmail.com", "122-1231-123");
        AddressBookData data3 = new AddressBookData("Jim", "Jimmy", "jim@gmail.com", "123-123-123");
        AddressBookData data4 = new AddressBookData("Emmet", "Green", "emmet@gmail.com", "456-456-468");
        AddressBookData data5 = new AddressBookData("Lucy", "Salt", "lucy@gmail.com", "123-789-795");

        //no need to declare it again , its already declared as a global variable
        //ArrayList<AddressBookData> listOfData = new ArrayList<>();
        AddressBookData[] arrayOfData = {data1, data2, data3, data4, data5};
        listOfData.addAll(Arrays.asList(arrayOfData));
        System.out.println(listOfData);

    }

    public ArrayList<AddressBookData> getAllEntries() {

        return listOfData;

    }

    public ArrayList<AddressBookData> searchByLastName(String lastname) {
        //declare an arrayList
        ArrayList<AddressBookData> list = new ArrayList<>();

        //loop through an array list(global variable)
        for (AddressBookData data : listOfData) {
            //see if the lastname matchesthe parameter
            //if there is a match
            if (data.getLastname().equals(lastname)) {
                list.add(data);
            }
        }

        //after the loop, return the new arraylList
        return list;
    }

   //@Override
    //public ArrayList<AddressBookData> getAllEntries() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
   // @Override
    // public ArrayList<AddressBookData> searchByLastName(String lastname) {
    //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }
    @Override
    public boolean insert(String firstname, String lastname, String email, String phoneNumber) {
        //take all parameters and construct a new AddressBookData object
        AddressBookData data = new AddressBookData(firstname, lastname, email, phoneNumber);
        //add that object to the arrayList
        //and return its success
        //the arrayList's add() returns True if successful.
        return listOfData.add(data);
    }

    @Override
    public boolean update(int id, String firstname, String lastname, String email, String phoneNumber) {
        return true;
    }

    @Override
    public boolean delete(int id) {
        //loop through the array list, find the matching
        //id and delete that element using iterator
        Iterator<AddressBookData> i = listOfData.iterator();
        
        while (i.hasNext()) {
            AddressBookData data = i.next();
            if (data.getId() == id) {//if the ids match
                i.remove();// removes the current element in the list
                return true;
            }
        }
        return false;// id not found
    }

}
