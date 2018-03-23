package be.tlemos.domain.users;

public class Customer {

    private int UserId;
    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String phoneNumber;

    public Customer(UserBuilder userBuilder){
        this.firstName = userBuilder.getFirstName();
        this.lastName = userBuilder.getLastName();
        this.eMailAddress = userBuilder.geteMailAddress();
        this.phoneNumber = userBuilder.getPhoneNumber();
    }


}
