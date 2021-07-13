package me.korakrit.playground.backendspringbootpostgresql.customers;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerId")
    private int customerid;

    @Column(name = "FirstName")
    private String firstname;

    @Column(name = "LastName")
    private String lastname;

    @Column(name = "Company")
    private String company;

    @Column(name = "Address")
    private String address;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "Country")
    private String country;

    @Column(name = "PostalCode")
    private String postalcode;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Fax")
    private String fax;

    @Column(name = "Email")
    private String email;

    @Column(name = "SupportRepId")
    private int supportrepid;

    public Customer(){

    }

    public Customer(int customerId, String firstName, String lastName, String company, String address, String city, String state, String country, String postalCode, String phone, String fax, String email, int supportRepId) {
        this.customerid = customerId;
        this.firstname = firstName;
        this.lastname = lastName;
        this.company = company;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalcode = postalCode;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.supportrepid = supportRepId;
    }

    public int getCustomerId() {
        return customerid;
    }

    public void setCustomerId(int customerId) {
        this.customerid = customerId;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalcode;
    }

    public void setPostalCode(String postalCode) {
        this.postalcode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSupportRepId() {
        return supportrepid;
    }

    public void setSupportRepId(int supportRepId) {
        this.supportrepid = supportRepId;
    }
}
