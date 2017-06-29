//MODEL

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsd09
 */
public class AddressBookData {

    //private member variables
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;

    private static int idCounter = 100;

    public AddressBookData() {
    }

    public AddressBookData(int id, String firstname, String lastname, String email, String phoneNumber) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public AddressBookData( String firstname, String lastname, String email, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    

    public void setId(int Id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nAddressBookData : "
                + "\nid=" + id
                + ", \nFirstname=" + firstname
                + ", \nLastname=" + lastname
                + ", \nEmail=" + email
                + ", \nPhoneNumber=" + phoneNumber;
    }

}
