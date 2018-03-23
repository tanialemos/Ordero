package be.tlemos.domain.users;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String phoneNumber;

    public static UserBuilder buildUser() {
        return new UserBuilder();
    }

    public UserBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withEMailAddress(String eMailAddress){
        this.eMailAddress = eMailAddress;
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Customer buildCustomer(){
        if (firstName != null && lastName != null &&
                eMailAddress != null && phoneNumber != null) {
            return new Customer(this);
        }
        else {
            throw new IllegalArgumentException("Please fill in all necessary fields.");
        }
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
