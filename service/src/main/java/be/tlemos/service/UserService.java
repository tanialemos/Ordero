package be.tlemos.service;

import be.tlemos.domain.users.Customer;
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
        try {
            listOfUsers = userRepository.getAllUsersFromRepository();
        }
        catch (Exception e){
        }
        return listOfUsers;
    }

    public User addNewCustomer(Customer customer){
        userRepository.addUserToRepository(customer);
        return customer;
    }

}
