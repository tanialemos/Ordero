package be.tlemos.domain.users;

public abstract class User {

    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String phoneNumber;

    public User(UserBuilder userBuilder){
    }
}
