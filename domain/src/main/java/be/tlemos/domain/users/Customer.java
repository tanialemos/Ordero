package be.tlemos.domain.users;

public class Customer extends User {

    private int UserId;

    public Customer(String firstName, String lastName, String eMailAddress, int phoneNumber) {
        super(firstName, lastName, eMailAddress, phoneNumber);
    }
}
