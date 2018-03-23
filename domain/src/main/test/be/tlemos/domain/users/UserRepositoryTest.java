package be.tlemos.domain.users;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepo;
    Customer customer1;
    Customer customer2;

    @BeforeEach
    void setUp(){
        userRepo = new UserRepository();

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
    }

    @Test
    void addUserToRepository_happyPath() {
        userRepo.addUserToRepository(customer1);
        userRepo.addUserToRepository(customer2);

        Assertions.assertThat(userRepo.getAllUsersFromRepository())
                .contains(customer1, customer2);
    }
}