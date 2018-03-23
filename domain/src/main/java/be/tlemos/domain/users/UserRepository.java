package be.tlemos.domain.users;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private int idCounter;
    private Map<Integer, User> userRepository;

    public UserRepository() {
        userRepository = new HashMap<>();
    }

    public Map<Integer, User> getAllUsers(){
        return Collections.unmodifiableMap(userRepository);
    }


}
