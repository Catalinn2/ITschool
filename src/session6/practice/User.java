package session6.practice;

import java.util.UUID;

public class User {

    private String firstName;

    private String lastName;

    private int age;

    private UUID userID;


    private boolean oldCustomer;

    private String phoneNumber;

    private String signInDate;

    private int currency;

    private String password;
    private UserAddress userAddress;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }


    public void setOldCustomer(boolean oldCustomer) {
        this.oldCustomer = oldCustomer;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSignInDate(String signInDate) {
        this.signInDate = signInDate;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public UUID getUserID() {
        return userID;
    }



    public boolean isOldCustomer() {
        return oldCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSignInDate() {
        return signInDate;
    }

    public int getCurrency() {
        return currency;
    }

    public String getPassword() {
        return password;
    }
}
