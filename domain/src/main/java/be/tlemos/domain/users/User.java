package be.tlemos.domain.users;

import java.util.UUID;

public abstract class User {

    private String userId;
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

    protected void setUserId(String userId){
        this.userId = UUID.randomUUID().toString();
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
