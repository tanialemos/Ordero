package be.tlemos.domain.users;

public abstract class User {

    private int userId;
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

    protected void setUserId(Integer userId){
        this.userId = userId;
    }

    public int getUserId() {
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
