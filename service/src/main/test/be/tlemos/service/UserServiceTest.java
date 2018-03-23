package be.tlemos.service;

import be.tlemos.domain.users.Customer;
import be.tlemos.domain.users.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService;
    UserRepository userRepoMock;
    Customer customer1;
    Customer customer2;

    void setUp(){
        userRepoMock = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepoMock);
    }

    @Test
    void getAllUsers() {
    }

    @Test
    void addNewCustomer() {
    }
}