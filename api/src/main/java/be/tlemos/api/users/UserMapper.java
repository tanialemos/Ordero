package be.tlemos.api.users;

import be.tlemos.domain.users.User;

import javax.inject.Named;

@Named
public class UserMapper {

    public UserDto mapUserToDto(User user){
        return new UserDto(user.getFirstName(),
                user.getLastName(),
                user.geteMailAddress(),
                user.getPhoneNumber());
    }

}
