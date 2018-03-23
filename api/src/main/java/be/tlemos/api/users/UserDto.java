package be.tlemos.api.users;

class UserDto {

    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String phoneNumber;

    UserDto(String firstName, String lastName, String eMailAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMailAddress = eMailAddress;
        this.phoneNumber = phoneNumber;
    }
}
