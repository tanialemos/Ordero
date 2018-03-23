package be.tlemos.domain.users;

public abstract class User {

    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String phoneNumber;

    public User(UserBuilder userBuilder){
        this.firstName = userBuilder.getFirstName();
        this.lastName = userBuilder.getLastName();
        this.eMailAddress = userBuilder.geteMailAddress();
        this.phoneNumber = userBuilder.getPhoneNumber();
    }
}
