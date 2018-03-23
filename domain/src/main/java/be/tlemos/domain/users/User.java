package be.tlemos.domain.users;

public abstract class User {

    private String firstName;
    private String lastName;
    private String eMailAddress;
    private int phoneNumber;

    public User(String firstName, String lastName, String eMailAddress, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMailAddress = eMailAddress;
        this.phoneNumber = phoneNumber;
    }

}
