package be.tlemos.api.users;

public class UserDto {

    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String phoneNumber;

    private UserDto() {
    }

    public UserDto(String firstName, String lastName, String eMailAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMailAddress = eMailAddress;
        this.phoneNumber = phoneNumber;
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
