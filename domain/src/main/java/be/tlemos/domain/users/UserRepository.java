package be.tlemos.domain.users;

import javax.inject.Named;
import java.util.*;

@Named
public class UserRepository {

    private int idCounter;
    private Map<Integer, User> userRepository;

    public UserRepository() {
        userRepository = new HashMap<>();
        idCounter = 1;
    }

    public List<User> getAllUsersFromRepository() throws NullPointerException {
        List<User> userList = new ArrayList<>();
        if (!userRepository.isEmpty()) {
            userList.addAll(userRepository.values());
        }
        else {
            throw new NullPointerException("There are no users registered.");
        }
        return userList;
    }

    public void addUserToRepository(User user){
        user.setUserId(idCounter);
        userRepository.put(idCounter, user);
        idCounter++;
    }

//    class UserData {
//
//        Customer customer1;
//        Customer customer2;
//
//        customer1 = UserBuilder.buildUser()
//                .withFirstName("Test")
//                .withLastName("Customer")
//                .withEMailAddress("testcustomer@gmail.com")
//                .withPhoneNumber("4520702")
//                .buildCustomer();
//
//        customer2 = UserBuilder.buildUser()
//                .withFirstName("Test")
//                .withLastName("Customer2")
//                .withEMailAddress("test2@gmail.com")
//                .withPhoneNumber("8546259")
//                .buildCustomer();
//
//    }

}
