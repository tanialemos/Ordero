package be.tlemos.service;

import be.tlemos.domain.users.Customer;
import be.tlemos.domain.users.User;
import be.tlemos.domain.users.UserBuilder;
import be.tlemos.domain.users.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

class UserServiceTest {

    UserService userService;
    UserRepository userRepoMock;
    Customer customer1;
    Customer customer2;
    List<User> testList;

    @BeforeEach
    void setUp(){
        userRepoMock = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepoMock);

        customer1 = UserBuilder.buildUser()
                .withFirstName("Test")
                .withLastName("Customer")
                .withEMailAddress("testcustomer@gmail.com")
                .withPhoneNumber("4520702")
                .buildCustomer();

        customer2 = UserBuilder.buildUser()
                .withFirstName("Test")
                .withLastName("Customer2")
                .withEMailAddress("test2@gmail.com")
                .withPhoneNumber("8546259")
                .buildCustomer();

        testList = new ArrayList<>();
        testList.add(customer1);
        testList.add(customer2);
    }

//    @Test
//    void getAllUsers_verifyUserRepoIsCalled() {
//
//    }

    @Test
    void addNewCustomer_happyPath() {
        when(userRepoMock.getAllUsersFromRepository()).thenReturn(testList);

        userService.addNewCustomer(customer1);
        userService.addNewCustomer(customer2);

        Assertions.assertThat(userService.getAllUsers()).isEqualTo(testList);
    }
}