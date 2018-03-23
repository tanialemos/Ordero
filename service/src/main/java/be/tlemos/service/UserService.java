package be.tlemos.service;

import be.tlemos.domain.users.User;
import be.tlemos.domain.users.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class UserService {

    private UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List listOfUsers = new ArrayList();
        listOfUsers.addAll(userRepository.getAllUsersFromRepository().values());
        return listOfUsers;
    }

    public void addUser(User user){
        userRepository.addUserToRepository(user);
    }

}
