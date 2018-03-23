package be.tlemos.domain.users;

import javax.inject.Named;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Named
public class UserRepository {

    private int idCounter;
    private Map<Integer, User> userRepository;

    public UserRepository() {
        userRepository = new HashMap<>();
        idCounter = 1;
    }

    public Map<Integer, User> getAllUsersFromRepository(){
        return Collections.unmodifiableMap(userRepository);
    }

    public void addUserToRepository(User user){
        user.setUserId(idCounter);
        userRepository.put(idCounter, user);
        idCounter++;
    }

}
