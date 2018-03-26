package be.tlemos.api.users;

import be.tlemos.domain.users.Customer;
import be.tlemos.domain.users.User;
import be.tlemos.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    private UserMapper userMapper;

    @Inject
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getUsers(){
        List<UserDto> userDtoList = new ArrayList<>();
        for (User user : userService.getAllUsers()){
            userDtoList.add(userMapper.mapUserToDto(user));
        }
        return userDtoList;
    }

    @PostMapping(path = "/customers", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createCustomerAccount(@RequestBody UserDto customer){
        User user  = userService.addNewCustomer(userMapper.mapDtoToUser(customer));
        return userMapper.mapUserToDto(user);
    }
}
