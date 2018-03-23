package be.tlemos.api.users;

import be.tlemos.domain.users.User;
import be.tlemos.domain.users.UserBuilder;

import javax.inject.Named;

@Named
public class UserMapper {

    public UserDto mapUserToDto(User user){
        return new UserDto(user.getFirstName(),
                user.getLastName(),
                user.geteMailAddress(),
                user.getPhoneNumber());
    }

    public User mapDtoToUser(UserDto UserDto){
        return UserBuilder.buildUser()
                .withFirstName(UserDto.getFirstName())
                .withLastName(UserDto.getLastName())
                .withEMailAddress(UserDto.geteMailAddress())
                .withPhoneNumber(UserDto.getPhoneNumber())
                .buildCustomer();
    }

}
