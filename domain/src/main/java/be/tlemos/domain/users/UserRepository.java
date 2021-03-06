package be.tlemos.domain.users;

import javax.inject.Named;
import java.util.*;

@Named
public class UserRepository {

    private Map<String, User> userRepository;
    private User user1;
    private User user2;
    private User user3;

    public UserRepository() {
        userRepository = new HashMap<>();
        initialDataInRepository();
    }

    public void initialDataInRepository(){
        user1 = new Customer(UserBuilder.buildUser().withFirstName("John").withLastName("Smith").withEMailAddress("john.smith@gmail.com").withPhoneNumber("0467895265"));
        user2 = new Customer(UserBuilder.buildUser().withFirstName("Mary").withLastName("Jane").withEMailAddress("mary.jane@gmail.com").withPhoneNumber("0468954125"));
        user3 = new Customer(UserBuilder.buildUser().withFirstName("Peter").withLastName("Parker").withEMailAddress("peter.parker@gmail.com").withPhoneNumber("0489615789"));
        addUserToRepository(user1);
        addUserToRepository(user2);
        addUserToRepository(user3);
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
        user.setUserId(UUID.randomUUID().toString());
        userRepository.put(user.getUserId(), user);
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
