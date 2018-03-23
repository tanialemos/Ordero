package be.tlemos.domain.users;

public class Customer extends User {

    private int UserId;
    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String phoneNumber;

    public Customer(UserBuilder userBuilder){
        super(userBuilder);
    }


}
